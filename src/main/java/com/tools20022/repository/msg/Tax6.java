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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tax related to an investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmAmountOrRateRule
 * Tax6.mmAmountOrRateRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmType Tax6.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmAmount Tax6.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmRate Tax6.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmRecipientIdentification
 * Tax6.mmRecipientIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmExemptionIndicator
 * Tax6.mmExemptionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmExemptionReason
 * Tax6.mmExemptionReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmTaxCalculationDetails
 * Tax6.mmTaxCalculationDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Tax6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Tax related to an investment fund order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Tax6", propOrder = {"type", "amount", "rate", "recipientIdentification", "exemptionIndicator", "exemptionReason", "taxCalculationDetails"})
public class Tax6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TaxType1 type;
	/**
	 * Type of tax applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TaxType1
	 * TaxType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax6 Tax6}</li>
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
	 * definition} = "Type of tax applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmType;
			componentContext_lazy = () -> Tax6.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.TaxType1.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount amount;
	/**
	 * Amount of money resulting from the calculation of the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax6 Tax6}</li>
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
	 * "Amount of money resulting from the calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> Tax6.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money resulting from the calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected PercentageRate rate;
	/**
	 * Rate used to calculate the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax6 Tax6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used to calculate the tax."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> Tax6.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Rate used to calculate the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PartyIdentification2Choice recipientIdentification;
	/**
	 * Party that receives the tax. The recipient of, and the party entitled to,
	 * the tax may be two different parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax6 Tax6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives the tax. The recipient of, and the party entitled to, the tax may be two different parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecipientIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Tax6.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Party that receives the tax. The recipient of, and the party entitled to, the tax may be two different parties.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected YesNoIndicator exemptionIndicator;
	/**
	 * Indicates whether a tax exemption applies.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmExemptionIndicator
	 * InvestmentFundTax.mmExemptionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax6 Tax6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether a tax exemption applies."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExemptionIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmExemptionIndicator;
			componentContext_lazy = () -> Tax6.mmObject();
			isDerived = false;
			xmlTag = "XmptnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionIndicator";
			definition = "Indicates whether a tax exemption applies.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected TaxExemptionReason1 exemptionReason;
	/**
	 * Reason for a tax exemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TaxExemptionReason1
	 * TaxExemptionReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmExemptionReason
	 * Tax.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax6 Tax6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for a tax exemption."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExemptionReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmExemptionReason;
			componentContext_lazy = () -> Tax6.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TaxExemptionReason1.mmObject();
		}
	};
	protected TaxCalculationInformation1 taxCalculationDetails;
	/**
	 * Information used to calculate the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation1
	 * TaxCalculationInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Tax6 Tax6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxClctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCalculationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information used to calculate the tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxCalculationDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> Tax6.mmObject();
			isDerived = false;
			xmlTag = "TaxClctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCalculationDetails";
			definition = "Information used to calculate the tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxCalculationInformation1.mmObject();
		}
	};
	/**
	 * Either Amount or Rate must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} = {@linkplain com.tools20022.repository.msg.Tax6 Tax6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmAmount
	 * Tax6.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmRate Tax6.mmRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountOrRateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either Amount or Rate must be present, but not both."</li>
	 * </ul>
	 */
	public static final MMXor mmAmountOrRateRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountOrRateRule";
			definition = "Either Amount or Rate must be present, but not both.";
			messageComponent_lazy = () -> Tax6.mmObject();
			impactedElements_lazy = () -> Arrays.asList(Tax6.mmAmount, Tax6.mmRate);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Tax6.mmType, Tax6.mmAmount, Tax6.mmRate, Tax6.mmRecipientIdentification, Tax6.mmExemptionIndicator, Tax6.mmExemptionReason, Tax6.mmTaxCalculationDetails);
				trace_lazy = () -> InvestmentFundTax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Tax6";
				definition = "Tax related to an investment fund order.";
				xors_lazy = () -> Arrays.asList(Tax6.mmAmountOrRateRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Tp", required = true)
	public TaxType1 getType() {
		return type;
	}

	public void setType(com.tools20022.repository.msg.TaxType1 type) {
		this.type = type;
	}

	@XmlElement(name = "Amt", required = true)
	public ActiveCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = amount;
	}

	@XmlElement(name = "Rate", required = true)
	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	@XmlElement(name = "RcptId")
	public PartyIdentification2Choice getRecipientIdentification() {
		return recipientIdentification;
	}

	public void setRecipientIdentification(PartyIdentification2Choice recipientIdentification) {
		this.recipientIdentification = recipientIdentification;
	}

	@XmlElement(name = "XmptnInd", required = true)
	public YesNoIndicator getExemptionIndicator() {
		return exemptionIndicator;
	}

	public void setExemptionIndicator(YesNoIndicator exemptionIndicator) {
		this.exemptionIndicator = exemptionIndicator;
	}

	@XmlElement(name = "XmptnRsn")
	public TaxExemptionReason1 getExemptionReason() {
		return exemptionReason;
	}

	public void setExemptionReason(com.tools20022.repository.msg.TaxExemptionReason1 exemptionReason) {
		this.exemptionReason = exemptionReason;
	}

	@XmlElement(name = "TaxClctnDtls")
	public TaxCalculationInformation1 getTaxCalculationDetails() {
		return taxCalculationDetails;
	}

	public void setTaxCalculationDetails(com.tools20022.repository.msg.TaxCalculationInformation1 taxCalculationDetails) {
		this.taxCalculationDetails = taxCalculationDetails;
	}
}