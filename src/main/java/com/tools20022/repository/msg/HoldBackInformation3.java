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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SecurityIdentification25Choice;
import com.tools20022.repository.codeset.GateHoldBack1Code;
import com.tools20022.repository.codeset.RedemptionCompletion1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.entity.LocalName;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about hold back and gating.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmType
 * HoldBackInformation3.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmAmount
 * HoldBackInformation3.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmExpectedReleaseDate
 * HoldBackInformation3.mmExpectedReleaseDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmFinancialInstrumentIdentification
 * HoldBackInformation3.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmFinancialInstrumentName
 * HoldBackInformation3.mmFinancialInstrumentName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3#mmRedemptionCompletion
 * HoldBackInformation3.mmRedemptionCompletion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "HoldBackInformation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about hold back and gating."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2
 * HoldBackInformation2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "HoldBackInformation3", propOrder = {"type", "amount", "expectedReleaseDate", "financialInstrumentIdentification", "financialInstrumentName", "redemptionCompletion"})
public class HoldBackInformation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected GateHoldBack1Code type;
	/**
	 * Type of gating or a hold back.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.GateHoldBack1Code
	 * GateHoldBack1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3
	 * HoldBackInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of gating or a hold back."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmType
	 * HoldBackInformation2.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> HoldBackInformation3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of gating or a hold back.";
			previousVersion_lazy = () -> HoldBackInformation2.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> GateHoldBack1Code.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount amount;
	/**
	 * Value of the redemption amount subject to gating or a hold back.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmHoldBackAmount
	 * InvestmentFundClass.mmHoldBackAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3
	 * HoldBackInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the redemption amount subject to gating or a hold back."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmAmount
	 * HoldBackInformation2.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmHoldBackAmount;
			componentContext_lazy = () -> HoldBackInformation3.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Value of the redemption amount subject to gating or a hold back.";
			previousVersion_lazy = () -> HoldBackInformation2.mmAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ISODate expectedReleaseDate;
	/**
	 * Date on which the gated amount or hold back amount is expected to be
	 * released.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmHoldBackReleaseDate
	 * InvestmentFundClass.mmHoldBackReleaseDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3
	 * HoldBackInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdRlsDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedReleaseDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the gated amount or hold back amount is expected to be released."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmExpectedReleaseDate
	 * HoldBackInformation2.mmExpectedReleaseDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpectedReleaseDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmHoldBackReleaseDate;
			componentContext_lazy = () -> HoldBackInformation3.mmObject();
			isDerived = false;
			xmlTag = "XpctdRlsDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedReleaseDate";
			definition = "Date on which the gated amount or hold back amount is expected to be released.";
			previousVersion_lazy = () -> HoldBackInformation2.mmExpectedReleaseDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected SecurityIdentification25Choice financialInstrumentIdentification;
	/**
	 * New identification of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification25Choice
	 * SecurityIdentification25Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3
	 * HoldBackInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New identification of the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmFinancialInstrumentIdentification
	 * HoldBackInformation2.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> HoldBackInformation3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "New identification of the security.";
			previousVersion_lazy = () -> HoldBackInformation2.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification25Choice.mmObject();
		}
	};
	protected Max350Text financialInstrumentName;
	/**
	 * New name of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmFullName
	 * LocalName.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3
	 * HoldBackInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New name of the security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmFinancialInstrumentName
	 * HoldBackInformation2.mmFinancialInstrumentName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialInstrumentName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> HoldBackInformation3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentName";
			definition = "New name of the security.";
			previousVersion_lazy = () -> HoldBackInformation2.mmFinancialInstrumentName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected RedemptionCompletion1Code redemptionCompletion;
	/**
	 * Specifies whether or not additional redemption order instructions are
	 * required in order for the redemption to be completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RedemptionCompletion1Code
	 * RedemptionCompletion1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation3
	 * HoldBackInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedCmpltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionCompletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether or not additional redemption order instructions are required in order for the redemption to be completed. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.HoldBackInformation2#mmRedemptionCompletion
	 * HoldBackInformation2.mmRedemptionCompletion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRedemptionCompletion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> HoldBackInformation3.mmObject();
			isDerived = false;
			xmlTag = "RedCmpltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionCompletion";
			definition = "Specifies whether or not additional redemption order instructions are required in order for the redemption to be completed. ";
			previousVersion_lazy = () -> HoldBackInformation2.mmRedemptionCompletion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RedemptionCompletion1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(HoldBackInformation3.mmType, HoldBackInformation3.mmAmount, HoldBackInformation3.mmExpectedReleaseDate, HoldBackInformation3.mmFinancialInstrumentIdentification,
						HoldBackInformation3.mmFinancialInstrumentName, HoldBackInformation3.mmRedemptionCompletion);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HoldBackInformation3";
				definition = "Information about hold back and gating.";
				previousVersion_lazy = () -> HoldBackInformation2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Tp", required = true)
	public GateHoldBack1Code getType() {
		return type;
	}

	public void setType(GateHoldBack1Code type) {
		this.type = type;
	}

	@XmlElement(name = "Amt")
	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = amount;
	}

	@XmlElement(name = "XpctdRlsDt")
	public ISODate getExpectedReleaseDate() {
		return expectedReleaseDate;
	}

	public void setExpectedReleaseDate(ISODate expectedReleaseDate) {
		this.expectedReleaseDate = expectedReleaseDate;
	}

	@XmlElement(name = "FinInstrmId")
	public SecurityIdentification25Choice getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(SecurityIdentification25Choice financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "FinInstrmNm")
	public Max350Text getFinancialInstrumentName() {
		return financialInstrumentName;
	}

	public void setFinancialInstrumentName(Max350Text financialInstrumentName) {
		this.financialInstrumentName = financialInstrumentName;
	}

	@XmlElement(name = "RedCmpltn")
	public RedemptionCompletion1Code getRedemptionCompletion() {
		return redemptionCompletion;
	}

	public void setRedemptionCompletion(RedemptionCompletion1Code redemptionCompletion) {
		this.redemptionCompletion = redemptionCompletion;
	}
}