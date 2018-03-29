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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Charges;
import com.tools20022.repository.entity.Commission;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Fee2;
import com.tools20022.repository.msg.Tax31;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money associated with a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmTotalOverheadApplied
 * TotalFeesAndTaxes40.mmTotalOverheadApplied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmTotalFees
 * TotalFeesAndTaxes40.mmTotalFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmTotalTaxes
 * TotalFeesAndTaxes40.mmTotalTaxes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmCommercialAgreementReference
 * TotalFeesAndTaxes40.mmCommercialAgreementReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmIndividualFee
 * TotalFeesAndTaxes40.mmIndividualFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmIndividualTax
 * TotalFeesAndTaxes40.mmIndividualTax}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNonStandardsSLAReferenceRule#forTotalFeesAndTaxes40
 * ConstraintNonStandardsSLAReferenceRule.forTotalFeesAndTaxes40}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionOverheadElementRule#forTotalFeesAndTaxes40
 * ConstraintTransactionOverheadElementRule.forTotalFeesAndTaxes40}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TotalFeesAndTaxes40"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money associated with a service."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TotalCharges3
 * TotalCharges3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TotalFeesAndTaxes40", propOrder = {"totalOverheadApplied", "totalFees", "totalTaxes", "commercialAgreementReference", "individualFee", "individualTax"})
public class TotalFeesAndTaxes40 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlOvrhdApld")
	protected ActiveCurrencyAndAmount totalOverheadApplied;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
	 * TotalFeesAndTaxes40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlOvrhdApld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalOverheadApplied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of overhead applied to the transaction that impacts the settlement amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalFeesAndTaxes40, Optional<ActiveCurrencyAndAmount>> mmTotalOverheadApplied = new MMMessageAttribute<TotalFeesAndTaxes40, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalFeesAndTaxes40.mmObject();
			isDerived = false;
			xmlTag = "TtlOvrhdApld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalOverheadApplied";
			definition = "Total amount of overhead applied to the transaction that impacts the settlement amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TotalFeesAndTaxes40 obj) {
			return obj.getTotalOverheadApplied();
		}

		@Override
		public void setValue(TotalFeesAndTaxes40 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalOverheadApplied(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlFees")
	protected ActiveCurrencyAndAmount totalFees;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
	 * TotalFeesAndTaxes40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of fees (charge/commissions) applied to the transaction that impacts the settlement amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalFeesAndTaxes40, Optional<ActiveCurrencyAndAmount>> mmTotalFees = new MMMessageAttribute<TotalFeesAndTaxes40, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalFeesAndTaxes40.mmObject();
			isDerived = false;
			xmlTag = "TtlFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalFees";
			definition = "Total amount of fees (charge/commissions) applied to the transaction that impacts the settlement amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TotalFeesAndTaxes40 obj) {
			return obj.getTotalFees();
		}

		@Override
		public void setValue(TotalFeesAndTaxes40 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalFees(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlTaxs")
	protected ActiveCurrencyAndAmount totalTaxes;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
	 * TotalFeesAndTaxes40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlTaxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTaxes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of taxes applied to the transaction that impacts the settlement amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalFeesAndTaxes40, Optional<ActiveCurrencyAndAmount>> mmTotalTaxes = new MMMessageAttribute<TotalFeesAndTaxes40, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalFeesAndTaxes40.mmObject();
			isDerived = false;
			xmlTag = "TtlTaxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalTaxes";
			definition = "Total amount of taxes applied to the transaction that impacts the settlement amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TotalFeesAndTaxes40 obj) {
			return obj.getTotalTaxes();
		}

		@Override
		public void setValue(TotalFeesAndTaxes40 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalTaxes(value.orElse(null));
		}
	};
	@XmlElement(name = "ComrclAgrmtRef")
	protected Max35Text commercialAgreementReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommercialAgreementReference
	 * Commission.mmCommercialAgreementReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
	 * TotalFeesAndTaxes40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclAgrmtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialAgreementReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the agreement established between the fund and another party. This element, amongst others, defines the conditions of the commissions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TotalFeesAndTaxes40, Optional<Max35Text>> mmCommercialAgreementReference = new MMMessageAttribute<TotalFeesAndTaxes40, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommercialAgreementReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalFeesAndTaxes40.mmObject();
			isDerived = false;
			xmlTag = "ComrclAgrmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialAgreementReference";
			definition = "Reference to the agreement established between the fund and another party. This element, amongst others, defines the conditions of the commissions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TotalFeesAndTaxes40 obj) {
			return obj.getCommercialAgreementReference();
		}

		@Override
		public void setValue(TotalFeesAndTaxes40 obj, Optional<Max35Text> value) {
			obj.setCommercialAgreementReference(value.orElse(null));
		}
	};
	@XmlElement(name = "IndvFee")
	protected List<Fee2> individualFee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Fee2 Fee2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
	 * TotalFeesAndTaxes40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Individual fee (charge/commission)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1#mmIndividualFee
	 * FeeAndTax1.mmIndividualFee}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TotalFeesAndTaxes40, List<Fee2>> mmIndividualFee = new MMMessageAssociationEnd<TotalFeesAndTaxes40, List<Fee2>>() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalFeesAndTaxes40.mmObject();
			isDerived = false;
			xmlTag = "IndvFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualFee";
			definition = "Individual fee (charge/commission).";
			nextVersions_lazy = () -> Arrays.asList(FeeAndTax1.mmIndividualFee);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Fee2.mmObject();
		}

		@Override
		public List<Fee2> getValue(TotalFeesAndTaxes40 obj) {
			return obj.getIndividualFee();
		}

		@Override
		public void setValue(TotalFeesAndTaxes40 obj, List<Fee2> value) {
			obj.setIndividualFee(value);
		}
	};
	@XmlElement(name = "IndvTax")
	protected List<Tax31> individualTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax31 Tax31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
	 * TotalFeesAndTaxes40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Individual tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1#mmIndividualTax
	 * FeeAndTax1.mmIndividualTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TotalFeesAndTaxes40, List<Tax31>> mmIndividualTax = new MMMessageAssociationEnd<TotalFeesAndTaxes40, List<Tax31>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TotalFeesAndTaxes40.mmObject();
			isDerived = false;
			xmlTag = "IndvTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualTax";
			definition = "Individual tax.";
			nextVersions_lazy = () -> Arrays.asList(FeeAndTax1.mmIndividualTax);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax31.mmObject();
		}

		@Override
		public List<Tax31> getValue(TotalFeesAndTaxes40 obj) {
			return obj.getIndividualTax();
		}

		@Override
		public void setValue(TotalFeesAndTaxes40 obj, List<Tax31> value) {
			obj.setIndividualTax(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalFeesAndTaxes40.mmTotalOverheadApplied, com.tools20022.repository.msg.TotalFeesAndTaxes40.mmTotalFees,
						com.tools20022.repository.msg.TotalFeesAndTaxes40.mmTotalTaxes, com.tools20022.repository.msg.TotalFeesAndTaxes40.mmCommercialAgreementReference, com.tools20022.repository.msg.TotalFeesAndTaxes40.mmIndividualFee,
						com.tools20022.repository.msg.TotalFeesAndTaxes40.mmIndividualTax);
				trace_lazy = () -> InvestmentFundTax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNonStandardsSLAReferenceRule.forTotalFeesAndTaxes40,
						com.tools20022.repository.constraints.ConstraintTransactionOverheadElementRule.forTotalFeesAndTaxes40);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalFeesAndTaxes40";
				definition = "Amount of money associated with a service.";
				previousVersion_lazy = () -> TotalCharges3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAndAmount> getTotalOverheadApplied() {
		return totalOverheadApplied == null ? Optional.empty() : Optional.of(totalOverheadApplied);
	}

	public TotalFeesAndTaxes40 setTotalOverheadApplied(ActiveCurrencyAndAmount totalOverheadApplied) {
		this.totalOverheadApplied = totalOverheadApplied;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalFees() {
		return totalFees == null ? Optional.empty() : Optional.of(totalFees);
	}

	public TotalFeesAndTaxes40 setTotalFees(ActiveCurrencyAndAmount totalFees) {
		this.totalFees = totalFees;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalTaxes() {
		return totalTaxes == null ? Optional.empty() : Optional.of(totalTaxes);
	}

	public TotalFeesAndTaxes40 setTotalTaxes(ActiveCurrencyAndAmount totalTaxes) {
		this.totalTaxes = totalTaxes;
		return this;
	}

	public Optional<Max35Text> getCommercialAgreementReference() {
		return commercialAgreementReference == null ? Optional.empty() : Optional.of(commercialAgreementReference);
	}

	public TotalFeesAndTaxes40 setCommercialAgreementReference(Max35Text commercialAgreementReference) {
		this.commercialAgreementReference = commercialAgreementReference;
		return this;
	}

	public List<Fee2> getIndividualFee() {
		return individualFee == null ? individualFee = new ArrayList<>() : individualFee;
	}

	public TotalFeesAndTaxes40 setIndividualFee(List<Fee2> individualFee) {
		this.individualFee = Objects.requireNonNull(individualFee);
		return this;
	}

	public List<Tax31> getIndividualTax() {
		return individualTax == null ? individualTax = new ArrayList<>() : individualTax;
	}

	public TotalFeesAndTaxes40 setIndividualTax(List<Tax31> individualTax) {
		this.individualTax = Objects.requireNonNull(individualTax);
		return this;
	}
}