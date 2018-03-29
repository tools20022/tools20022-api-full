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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.OtherSemanticMarkup;
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
import com.tools20022.repository.msg.AmountAndDirection29;
import com.tools20022.repository.msg.PartyIdentification54;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: Comm</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Commission16", propOrder = {"type", "commission", "recipientIdentification", "calculationDate", "totalCommission", "totalVATAmount", "vATRate"})
public class Commission16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected CommissionType2Choice type;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 13</li>
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
	public static final MMMessageAssociationEnd<Commission16, CommissionType2Choice> mmType = new MMMessageAssociationEnd<Commission16, CommissionType2Choice>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommissionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission16.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "13"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specification of the commission type.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CommissionType2Choice.mmObject();
		}

		@Override
		public CommissionType2Choice getValue(Commission16 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Commission16 obj, CommissionType2Choice value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Comssn", required = true)
	protected AmountOrRate2Choice commission;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 12, FIXSynonym: 479</li>
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
	public static final MMMessageAttribute<Commission16, AmountOrRate2Choice> mmCommission = new MMMessageAttribute<Commission16, AmountOrRate2Choice>() {
		{
			businessComponentTrace_lazy = () -> Commission.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission16.mmObject();
			isDerived = false;
			xmlTag = "Comssn";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "12"), new FIXSynonym(this, "479"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			definition = "Amount of money due to a party as compensation for a service.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountOrRate2Choice.mmObject();
		}

		@Override
		public AmountOrRate2Choice getValue(Commission16 obj) {
			return obj.getCommission();
		}

		@Override
		public void setValue(Commission16 obj, AmountOrRate2Choice value) {
			obj.setCommission(value);
		}
	};
	@XmlElement(name = "RcptId")
	protected PartyIdentification54 recipientIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=Synonym, context=ISO, value=15022</li>
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
	public static final MMMessageAssociationEnd<Commission16, Optional<PartyIdentification54>> mmRecipientIdentification = new MMMessageAssociationEnd<Commission16, Optional<PartyIdentification54>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission16.mmObject();
			isDerived = false;
			xmlTag = "RcptId";
			semanticMarkup_lazy = () -> Arrays.asList(new OtherSemanticMarkup(this, "Synonym", new String[]{"context", "ISO"}, new String[]{"value", "15022"}));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientIdentification";
			definition = "Information related to an identification, eg, party identification or account identification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification54.mmObject();
		}

		@Override
		public Optional<PartyIdentification54> getValue(Commission16 obj) {
			return obj.getRecipientIdentification();
		}

		@Override
		public void setValue(Commission16 obj, Optional<PartyIdentification54> value) {
			obj.setRecipientIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ClctnDt")
	protected ISODate calculationDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Commission16, Optional<ISODate>> mmCalculationDate = new MMMessageAttribute<Commission16, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCalculationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission16.mmObject();
			isDerived = false;
			xmlTag = "ClctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDate";
			definition = "Date at which an operation is triggered to calculate, for instance, a commission, fee, asset values, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Commission16 obj) {
			return obj.getCalculationDate();
		}

		@Override
		public void setValue(Commission16 obj, Optional<ISODate> value) {
			obj.setCalculationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlComssn")
	protected AmountAndDirection29 totalCommission;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Commission16, Optional<AmountAndDirection29>> mmTotalCommission = new MMMessageAttribute<Commission16, Optional<AmountAndDirection29>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission16.mmObject();
			isDerived = false;
			xmlTag = "TtlComssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalCommission";
			definition = "Total value of the commissions for a specific trade.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndDirection29.mmObject();
		}

		@Override
		public Optional<AmountAndDirection29> getValue(Commission16 obj) {
			return obj.getTotalCommission();
		}

		@Override
		public void setValue(Commission16 obj, Optional<AmountAndDirection29> value) {
			obj.setTotalCommission(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlVATAmt")
	protected ActiveCurrencyAndAmount totalVATAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Commission16, Optional<ActiveCurrencyAndAmount>> mmTotalVATAmount = new MMMessageAttribute<Commission16, Optional<ActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission16.mmObject();
			isDerived = false;
			xmlTag = "TtlVATAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalVATAmount";
			definition = "Amount that results of the calculation of VAT on net fees, according to the transaction current tariffs.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Commission16 obj) {
			return obj.getTotalVATAmount();
		}

		@Override
		public void setValue(Commission16 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalVATAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "VATRate")
	protected BaseOneRate vATRate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<Commission16, Optional<BaseOneRate>> mmVATRate = new MMMessageAttribute<Commission16, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Commission16.mmObject();
			isDerived = false;
			xmlTag = "VATRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VATRate";
			definition = "Specifies the VAT rate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(Commission16 obj) {
			return obj.getVATRate();
		}

		@Override
		public void setValue(Commission16 obj, Optional<BaseOneRate> value) {
			obj.setVATRate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Commission16.mmType, com.tools20022.repository.msg.Commission16.mmCommission, com.tools20022.repository.msg.Commission16.mmRecipientIdentification,
						com.tools20022.repository.msg.Commission16.mmCalculationDate, com.tools20022.repository.msg.Commission16.mmTotalCommission, com.tools20022.repository.msg.Commission16.mmTotalVATAmount,
						com.tools20022.repository.msg.Commission16.mmVATRate);
				trace_lazy = () -> Commission.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "Comm"));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Commission16";
				definition = "Amount of money due to a party as compensation for a service.";
			}
		});
		return mmObject_lazy.get();
	}

	public CommissionType2Choice getType() {
		return type;
	}

	public Commission16 setType(CommissionType2Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public AmountOrRate2Choice getCommission() {
		return commission;
	}

	public Commission16 setCommission(AmountOrRate2Choice commission) {
		this.commission = Objects.requireNonNull(commission);
		return this;
	}

	public Optional<PartyIdentification54> getRecipientIdentification() {
		return recipientIdentification == null ? Optional.empty() : Optional.of(recipientIdentification);
	}

	public Commission16 setRecipientIdentification(PartyIdentification54 recipientIdentification) {
		this.recipientIdentification = recipientIdentification;
		return this;
	}

	public Optional<ISODate> getCalculationDate() {
		return calculationDate == null ? Optional.empty() : Optional.of(calculationDate);
	}

	public Commission16 setCalculationDate(ISODate calculationDate) {
		this.calculationDate = calculationDate;
		return this;
	}

	public Optional<AmountAndDirection29> getTotalCommission() {
		return totalCommission == null ? Optional.empty() : Optional.of(totalCommission);
	}

	public Commission16 setTotalCommission(AmountAndDirection29 totalCommission) {
		this.totalCommission = totalCommission;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalVATAmount() {
		return totalVATAmount == null ? Optional.empty() : Optional.of(totalVATAmount);
	}

	public Commission16 setTotalVATAmount(ActiveCurrencyAndAmount totalVATAmount) {
		this.totalVATAmount = totalVATAmount;
		return this;
	}

	public Optional<BaseOneRate> getVATRate() {
		return vATRate == null ? Optional.empty() : Optional.of(vATRate);
	}

	public Commission16 setVATRate(BaseOneRate vATRate) {
		this.vATRate = vATRate;
		return this;
	}
}