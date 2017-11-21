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
import com.tools20022.repository.choice.PriceFormat1Choice;
import com.tools20022.repository.choice.PriceFormat2Choice;
import com.tools20022.repository.choice.PriceFormat4Choice;
import com.tools20022.repository.entity.CorporateActionPrice;
import com.tools20022.repository.entity.Issuance;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies prices.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmExercisePrice
 * CorporateActionPrice1.mmExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmIssuePrice
 * CorporateActionPrice1.mmIssuePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmCashInLieuOfSharePrice
 * CorporateActionPrice1.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmTaxableIncomePerDividendShare
 * CorporateActionPrice1.mmTaxableIncomePerDividendShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice1.mmGenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice1.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmOverSubscriptionDepositPrice
 * CorporateActionPrice1.mmOverSubscriptionDepositPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionPrice
 * CorporateActionPrice}</li>
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
 * "CorporateActionPrice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionPrice1", propOrder = {"exercisePrice", "issuePrice", "cashInLieuOfSharePrice", "taxableIncomePerDividendShare", "genericCashPriceReceivedPerProduct", "genericCashPricePaidPerProduct",
		"overSubscriptionDepositPrice"})
public class CorporateActionPrice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PriceFormat4Choice exercisePrice;
	/**
	 * 1. Price at which security will be purchased/sold if warrant is
	 * exercised, either as an actual amount or a percentage. 2. Price at which
	 * a bond is converted to underlying security either as an actual amount or
	 * a percentage. 3. Strike price of an option, represented either as an
	 * actual amount, a percentage or or a number of points above an index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice
	 * PriceFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionExercisePrice
	 * CorporateActionPrice.mmCorporateActionExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1
	 * CorporateActionPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExrcPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\n3. Strike price of an option, represented either as an actual amount, a percentage or or a number of points above an index."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExercisePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCorporateActionExercisePrice;
			componentContext_lazy = () -> CorporateActionPrice1.mmObject();
			isDerived = false;
			xmlTag = "ExrcPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExercisePrice";
			definition = "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\n3. Strike price of an option, represented either as an actual amount, a percentage or or a number of points above an index.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat4Choice.mmObject();
		}
	};
	protected PriceFormat2Choice issuePrice;
	/**
	 * Initial issue price of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat2Choice
	 * PriceFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmIssuePrice
	 * Issuance.mmIssuePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1
	 * CorporateActionPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssePric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial issue price of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Issuance.mmIssuePrice;
			componentContext_lazy = () -> CorporateActionPrice1.mmObject();
			isDerived = false;
			xmlTag = "IssePric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuePrice";
			definition = "Initial issue price of a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat2Choice.mmObject();
		}
	};
	protected PriceFormat2Choice cashInLieuOfSharePrice;
	/**
	 * Cash disbursement in lieu of equities; usually in lieu of fractional
	 * quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat2Choice
	 * PriceFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
	 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1
	 * CorporateActionPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShrPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of equities; usually in lieu of fractional quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashInLieuOfSharePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmCashInLieuOfSharePrice;
			componentContext_lazy = () -> CorporateActionPrice1.mmObject();
			isDerived = false;
			xmlTag = "CshInLieuOfShrPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat2Choice.mmObject();
		}
	};
	protected AmountPrice1 taxableIncomePerDividendShare;
	/**
	 * Amount included in the dividend/NAV that is identified as gains directly
	 * or indirectly derived from interest payments within the scope of the EU
	 * Savings directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AmountPrice1
	 * AmountPrice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividendShare
	 * SecuritiesTax.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1
	 * CorporateActionPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxblIncmPerDvddShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividendShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxableIncomePerDividendShare = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmTaxableIncomePerDividendShare;
			componentContext_lazy = () -> CorporateActionPrice1.mmObject();
			isDerived = false;
			xmlTag = "TaxblIncmPerDvddShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxableIncomePerDividendShare";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountPrice1.mmObject();
		}
	};
	protected PriceFormat1Choice genericCashPriceReceivedPerProduct;
	/**
	 * Generic cash price received per product by the underlying security holder
	 * either as a percentage or an amount, eg, redemption price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat1Choice
	 * PriceFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1
	 * CorporateActionPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricRcvdPerPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price received per product by the underlying security holder either as a percentage or an amount, eg, redemption price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGenericCashPriceReceivedPerProduct = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPriceReceivedPerProduct;
			componentContext_lazy = () -> CorporateActionPrice1.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricRcvdPerPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, eg, redemption price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat1Choice.mmObject();
		}
	};
	protected PriceFormat2Choice genericCashPricePaidPerProduct;
	/**
	 * Generic cash price paid per product by the underlying security holder
	 * either as a percentage or an amount, eg, reinvestment price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat2Choice
	 * PriceFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1
	 * CorporateActionPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GncCshPricPdPerPdct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price paid per product by the underlying security holder either as a percentage or an amount, eg, reinvestment price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGenericCashPricePaidPerProduct = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmGenericCashPricePaidPerProduct;
			componentContext_lazy = () -> CorporateActionPrice1.mmObject();
			isDerived = false;
			xmlTag = "GncCshPricPdPerPdct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Generic cash price paid per product by the underlying security holder either as a percentage or an amount, eg, reinvestment price.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat2Choice.mmObject();
		}
	};
	protected PriceFormat2Choice overSubscriptionDepositPrice;
	/**
	 * Amount of money required per over-subscribed equity as defined by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat2Choice
	 * PriceFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1
	 * CorporateActionPrice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OverSbcptDpstPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverSubscriptionDepositPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money required per over-subscribed equity as defined by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOverSubscriptionDepositPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionPrice.mmOverSubscriptionDepositPrice;
			componentContext_lazy = () -> CorporateActionPrice1.mmObject();
			isDerived = false;
			xmlTag = "OverSbcptDpstPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverSubscriptionDepositPrice";
			definition = "Amount of money required per over-subscribed equity as defined by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceFormat2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionPrice1.mmExercisePrice, CorporateActionPrice1.mmIssuePrice, CorporateActionPrice1.mmCashInLieuOfSharePrice, CorporateActionPrice1.mmTaxableIncomePerDividendShare,
						CorporateActionPrice1.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice1.mmGenericCashPricePaidPerProduct, CorporateActionPrice1.mmOverSubscriptionDepositPrice);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice1";
				definition = "Specifies prices.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "ExrcPric")
	public PriceFormat4Choice getExercisePrice() {
		return exercisePrice;
	}

	public void setExercisePrice(PriceFormat4Choice exercisePrice) {
		this.exercisePrice = exercisePrice;
	}

	@XmlElement(name = "IssePric")
	public PriceFormat2Choice getIssuePrice() {
		return issuePrice;
	}

	public void setIssuePrice(PriceFormat2Choice issuePrice) {
		this.issuePrice = issuePrice;
	}

	@XmlElement(name = "CshInLieuOfShrPric")
	public PriceFormat2Choice getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice;
	}

	public void setCashInLieuOfSharePrice(PriceFormat2Choice cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = cashInLieuOfSharePrice;
	}

	@XmlElement(name = "TaxblIncmPerDvddShr")
	public AmountPrice1 getTaxableIncomePerDividendShare() {
		return taxableIncomePerDividendShare;
	}

	public void setTaxableIncomePerDividendShare(com.tools20022.repository.msg.AmountPrice1 taxableIncomePerDividendShare) {
		this.taxableIncomePerDividendShare = taxableIncomePerDividendShare;
	}

	@XmlElement(name = "GncCshPricRcvdPerPdct")
	public PriceFormat1Choice getGenericCashPriceReceivedPerProduct() {
		return genericCashPriceReceivedPerProduct;
	}

	public void setGenericCashPriceReceivedPerProduct(PriceFormat1Choice genericCashPriceReceivedPerProduct) {
		this.genericCashPriceReceivedPerProduct = genericCashPriceReceivedPerProduct;
	}

	@XmlElement(name = "GncCshPricPdPerPdct")
	public PriceFormat2Choice getGenericCashPricePaidPerProduct() {
		return genericCashPricePaidPerProduct;
	}

	public void setGenericCashPricePaidPerProduct(PriceFormat2Choice genericCashPricePaidPerProduct) {
		this.genericCashPricePaidPerProduct = genericCashPricePaidPerProduct;
	}

	@XmlElement(name = "OverSbcptDpstPric")
	public PriceFormat2Choice getOverSubscriptionDepositPrice() {
		return overSubscriptionDepositPrice;
	}

	public void setOverSubscriptionDepositPrice(PriceFormat2Choice overSubscriptionDepositPrice) {
		this.overSubscriptionDepositPrice = overSubscriptionDepositPrice;
	}
}