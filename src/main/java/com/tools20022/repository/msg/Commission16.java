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
import com.tools20022.repository.choice.AmountOrRate2Choice;
import com.tools20022.repository.choice.CommissionType2Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Commission;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money due to a party as compensation for a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Commission16#mmType
 * Commission16.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission16#mmCommission
 * Commission16.mmCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Commission16#mmRecipientIdentification
 * Commission16.mmRecipientIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission16#mmCalculationDate
 * Commission16.mmCalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission16#mmTotalCommission
 * Commission16.mmTotalCommission}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission16#mmTotalVATAmount
 * Commission16.mmTotalVATAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Commission16#mmVATRate
 * Commission16.mmVATRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
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
 * "Commission16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money due to a party as compensation for a service."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Commission16", propOrder = {"type", "commission", "recipientIdentification", "calculationDate", "totalCommission", "totalVATAmount", "VATRate"})
public class Commission16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CommissionType2Choice type;
	/**
	 * Specification of the commission type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CommissionType2Choice
	 * CommissionType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionType
	 * Commission.mmCommissionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission16 Commission16}</li>
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
	 * definition} = "Specification of the commission type."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommissionType;
			componentContext_lazy = () -> Commission16.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specification of the commission type.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CommissionType2Choice.mmObject();
		}
	};
	protected AmountOrRate2Choice commission;
	/**
	 * Amount of money due to a party as compensation for a service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AmountOrRate2Choice
	 * AmountOrRate2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission16 Commission16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Comssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to a party as compensation for a service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommission = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> Commission16.mmObject();
			isDerived = false;
			xmlTag = "Comssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			definition = "Amount of money due to a party as compensation for a service.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountOrRate2Choice.mmObject();
		}
	};
	protected PartyIdentification54 recipientIdentification;
	/**
	 * Information related to an identification, eg, party identification or
	 * account identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification54
	 * PartyIdentification54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission16 Commission16}</li>
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
	 * "Information related to an identification, eg, party identification or account identification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecipientIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Commission16.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Information related to an identification, eg, party identification or account identification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification54.mmObject();
		}
	};
	protected ISODate calculationDate;
	/**
	 * Date at which an operation is triggered to calculate, for instance, a
	 * commission, fee, asset values, etc.
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
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCalculationDate
	 * Commission.mmCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission16 Commission16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which an operation is triggered to calculate, for instance, a commission, fee, asset values, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCalculationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Commission.mmCalculationDate;
			componentContext_lazy = () -> Commission16.mmObject();
			isDerived = false;
			xmlTag = "ClctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDate";
			definition = "Date at which an operation is triggered to calculate, for instance, a commission, fee, asset values, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected AmountAndDirection29 totalCommission;
	/**
	 * Total value of the commissions for a specific trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29
	 * AmountAndDirection29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission16 Commission16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlComssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCommission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total value of the commissions for a specific trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalCommission = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> Commission16.mmObject();
			isDerived = false;
			xmlTag = "TtlComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCommission";
			definition = "Total value of the commissions for a specific trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AmountAndDirection29.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount totalVATAmount;
	/**
	 * Amount that results of the calculation of VAT on net fees, according to
	 * the transaction current tariffs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission16 Commission16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlVATAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalVATAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount that results of the calculation of VAT on net fees, according to the transaction current tariffs."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalVATAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Commission16.mmObject();
			isDerived = false;
			xmlTag = "TtlVATAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalVATAmount";
			definition = "Amount that results of the calculation of VAT on net fees, according to the transaction current tariffs.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected BaseOneRate vATRate;
	/**
	 * Specifies the VAT rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Commission16 Commission16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VATRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VATRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the VAT rate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVATRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> Commission16.mmObject();
			isDerived = false;
			xmlTag = "VATRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VATRate";
			definition = "Specifies the VAT rate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Commission16.mmType, Commission16.mmCommission, Commission16.mmRecipientIdentification, Commission16.mmCalculationDate, Commission16.mmTotalCommission,
						Commission16.mmTotalVATAmount, Commission16.mmVATRate);
				trace_lazy = () -> Commission.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Commission16";
				definition = "Amount of money due to a party as compensation for a service.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Tp", required = true)
	public CommissionType2Choice getType() {
		return type;
	}

	public void setType(CommissionType2Choice type) {
		this.type = type;
	}

	@XmlElement(name = "Comssn", required = true)
	public AmountOrRate2Choice getCommission() {
		return commission;
	}

	public void setCommission(AmountOrRate2Choice commission) {
		this.commission = commission;
	}

	@XmlElement(name = "RcptId")
	public PartyIdentification54 getRecipientIdentification() {
		return recipientIdentification;
	}

	public void setRecipientIdentification(com.tools20022.repository.msg.PartyIdentification54 recipientIdentification) {
		this.recipientIdentification = recipientIdentification;
	}

	@XmlElement(name = "ClctnDt")
	public ISODate getCalculationDate() {
		return calculationDate;
	}

	public void setCalculationDate(ISODate calculationDate) {
		this.calculationDate = calculationDate;
	}

	@XmlElement(name = "TtlComssn")
	public AmountAndDirection29 getTotalCommission() {
		return totalCommission;
	}

	public void setTotalCommission(com.tools20022.repository.msg.AmountAndDirection29 totalCommission) {
		this.totalCommission = totalCommission;
	}

	@XmlElement(name = "TtlVATAmt")
	public ActiveCurrencyAndAmount getTotalVATAmount() {
		return totalVATAmount;
	}

	public void setTotalVATAmount(ActiveCurrencyAndAmount totalVATAmount) {
		this.totalVATAmount = totalVATAmount;
	}

	@XmlElement(name = "VATRate")
	public BaseOneRate getVATRate() {
		return vATRate;
	}

	public void setVATRate(BaseOneRate vATRate) {
		this.vATRate = vATRate;
	}
}