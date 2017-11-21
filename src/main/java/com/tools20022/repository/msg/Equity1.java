/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PreferenceToIncome1Code;
import com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.Equity;
import com.tools20022.repository.entity.SecuritiesStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Financial instrument which represents a title of ownership in a company, ie,
 * the shareholder is entitled to a part of the company's profit - usually by
 * payment of a dividend - and to voting rights, if any. Each company issues
 * generally different classes of shares, eg, ordinary or common shares, which
 * have no guaranteed amount of dividend but carry voting rights, or preferred
 * shares, which receive dividends before ordinary shares but have no voting
 * right.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmPreferenceToIncome
 * Equity1.mmPreferenceToIncome}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmPaymentStatus
 * Equity1.mmPaymentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmConvertibleIndicator
 * Equity1.mmConvertibleIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmMaturityDate
 * Equity1.mmMaturityDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmNonPaidAmount
 * Equity1.mmNonPaidAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmParValue
 * Equity1.mmParValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Equity1#mmVotingRightsPerShare
 * Equity1.mmVotingRightsPerShare}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Equity Equity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Equity1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instrument which represents a title of ownership  in a company, ie,  the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, eg, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Equity1", propOrder = {"preferenceToIncome", "paymentStatus", "convertibleIndicator", "maturityDate", "nonPaidAmount", "parValue", "votingRightsPerShare"})
public class Equity1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PreferenceToIncome1Code preferenceToIncome;
	/**
	 * Indicates the level of priority to claim on income and assets of the
	 * company in case of the payment of dividends and in the event of a
	 * bankruptcy, for example, ordinary/common stocks, preferred stocks,
	 * subordinated debt, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PreferenceToIncome1Code
	 * PreferenceToIncome1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equity#mmPreferenceToIncome
	 * Equity.mmPreferenceToIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrefToIncm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreferenceToIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the  level of priority to claim on income and assets of the company in case of the payment of dividends and in the event of a bankruptcy, for example, ordinary/common stocks, preferred stocks, subordinated debt, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreferenceToIncome = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Equity.mmPreferenceToIncome;
			componentContext_lazy = () -> Equity1.mmObject();
			isDerived = false;
			xmlTag = "PrefToIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreferenceToIncome";
			definition = "Indicates the  level of priority to claim on income and assets of the company in case of the payment of dividends and in the event of a bankruptcy, for example, ordinary/common stocks, preferred stocks, subordinated debt, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PreferenceToIncome1Code.mmObject();
		}
	};
	protected SecuritiesPaymentStatus1Code paymentStatus;
	/**
	 * Status of payment of a security at a particular time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesPaymentStatus1Code
	 * SecuritiesPaymentStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesStatus#mmPaymentStatus
	 * SecuritiesStatus.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of payment of a security at a particular time."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesStatus.mmPaymentStatus;
			componentContext_lazy = () -> Equity1.mmObject();
			isDerived = false;
			xmlTag = "PmtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentStatus";
			definition = "Status of payment of a security at a particular time.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SecuritiesPaymentStatus1Code.mmObject();
		}
	};
	protected YesNoIndicator convertibleIndicator;
	/**
	 * Indicates whether the investor or the issuer has a conversion option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equity#mmConvertibleIndicator
	 * Equity.mmConvertibleIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConvtblInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertibleIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor or the issuer has a conversion option."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConvertibleIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Equity.mmConvertibleIndicator;
			componentContext_lazy = () -> Equity1.mmObject();
			isDerived = false;
			xmlTag = "ConvtblInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertibleIndicator";
			definition = "Indicates whether the investor or the issuer has a conversion option.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ISODateTime maturityDate;
	/**
	 * Date/time at which the security will no longer exist, for example,
	 * redeemable preference shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the security will no longer exist, for example, redeemable preference shares."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> Equity1.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date/time at which the security will no longer exist, for example, redeemable preference shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount nonPaidAmount;
	/**
	 * Nominal amount which is not paid yet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equity#mmNonPaidAmount
	 * Equity.mmNonPaidAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonPdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonPaidAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal amount which is not paid yet."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonPaidAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Equity.mmNonPaidAmount;
			componentContext_lazy = () -> Equity1.mmObject();
			isDerived = false;
			xmlTag = "NonPdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonPaidAmount";
			definition = "Nominal amount which is not paid yet.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount parValue;
	/**
	 * Nominal value of an equity security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equity#mmParValue
	 * Equity.mmParValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nominal value of an equity security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Equity.mmParValue;
			componentContext_lazy = () -> Equity1.mmObject();
			isDerived = false;
			xmlTag = "ParVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParValue";
			definition = "Nominal value of an equity security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected Number votingRightsPerShare;
	/**
	 * Number of voting rights per share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Equity#mmVotingRightsPerShare
	 * Equity.mmVotingRightsPerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Equity1
	 * Equity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VtngRghtsPerShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingRightsPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of voting rights per share."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVotingRightsPerShare = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Equity.mmVotingRightsPerShare;
			componentContext_lazy = () -> Equity1.mmObject();
			isDerived = false;
			xmlTag = "VtngRghtsPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingRightsPerShare";
			definition = "Number of voting rights per share.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Equity1.mmPreferenceToIncome, Equity1.mmPaymentStatus, Equity1.mmConvertibleIndicator, Equity1.mmMaturityDate, Equity1.mmNonPaidAmount, Equity1.mmParValue,
						Equity1.mmVotingRightsPerShare);
				trace_lazy = () -> Equity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Equity1";
				definition = "Financial instrument which represents a title of ownership  in a company, ie,  the shareholder is entitled to a part of the company's profit - usually by payment of a dividend - and to voting rights, if any. Each company issues generally different classes of shares, eg, ordinary or common shares, which have no guaranteed amount of dividend but carry voting rights, or preferred shares, which receive dividends before ordinary shares but have no voting right.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrefToIncm", required = true)
	public PreferenceToIncome1Code getPreferenceToIncome() {
		return preferenceToIncome;
	}

	public void setPreferenceToIncome(PreferenceToIncome1Code preferenceToIncome) {
		this.preferenceToIncome = preferenceToIncome;
	}

	@XmlElement(name = "PmtSts")
	public SecuritiesPaymentStatus1Code getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(SecuritiesPaymentStatus1Code paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@XmlElement(name = "ConvtblInd")
	public YesNoIndicator getConvertibleIndicator() {
		return convertibleIndicator;
	}

	public void setConvertibleIndicator(YesNoIndicator convertibleIndicator) {
		this.convertibleIndicator = convertibleIndicator;
	}

	@XmlElement(name = "MtrtyDt")
	public ISODateTime getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODateTime maturityDate) {
		this.maturityDate = maturityDate;
	}

	@XmlElement(name = "NonPdAmt")
	public ActiveCurrencyAndAmount getNonPaidAmount() {
		return nonPaidAmount;
	}

	public void setNonPaidAmount(ActiveCurrencyAndAmount nonPaidAmount) {
		this.nonPaidAmount = nonPaidAmount;
	}

	@XmlElement(name = "ParVal")
	public ActiveCurrencyAndAmount getParValue() {
		return parValue;
	}

	public void setParValue(ActiveCurrencyAndAmount parValue) {
		this.parValue = parValue;
	}

	@XmlElement(name = "VtngRghtsPerShr")
	public Number getVotingRightsPerShare() {
		return votingRightsPerShare;
	}

	public void setVotingRightsPerShare(Number votingRightsPerShare) {
		this.votingRightsPerShare = votingRightsPerShare;
	}
}