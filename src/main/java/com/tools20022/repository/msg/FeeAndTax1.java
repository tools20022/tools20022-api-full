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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Fee1;
import com.tools20022.repository.msg.Tax30;
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
 * {@linkplain com.tools20022.repository.msg.FeeAndTax1#mmCommercialAgreementReference
 * FeeAndTax1.mmCommercialAgreementReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1#mmIndividualFee
 * FeeAndTax1.mmIndividualFee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FeeAndTax1#mmIndividualTax
 * FeeAndTax1.mmIndividualTax}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintFeeTaxElementRule#forFeeAndTax1
 * ConstraintFeeTaxElementRule.forFeeAndTax1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FeeAndTax1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Amount of money associated with a service."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Fees1 Fees1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FeeAndTax1", propOrder = {"commercialAgreementReference", "individualFee", "individualTax"})
public class FeeAndTax1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCommission
	 * CashAccount.mmCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.FeeAndTax1
	 * FeeAndTax1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fees1#mmCommercialAgreementReference
	 * Fees1.mmCommercialAgreementReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FeeAndTax1, Optional<Max35Text>> mmCommercialAgreementReference = new MMMessageAttribute<FeeAndTax1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> CashAccount.mmCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.FeeAndTax1.mmObject();
			isDerived = false;
			xmlTag = "ComrclAgrmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialAgreementReference";
			definition = "Reference to the agreement established between the fund and another party. This element, amongst others, defines the conditions of the commissions.";
			nextVersions_lazy = () -> Arrays.asList(Fees1.mmCommercialAgreementReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(FeeAndTax1 obj) {
			return obj.getCommercialAgreementReference();
		}

		@Override
		public void setValue(FeeAndTax1 obj, Optional<Max35Text> value) {
			obj.setCommercialAgreementReference(value.orElse(null));
		}
	};
	@XmlElement(name = "IndvFee")
	protected List<Fee1> individualFee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Fee1 Fee1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
	 * InvestmentFundTransaction.mmTransactionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.FeeAndTax1
	 * FeeAndTax1}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Fees1#mmIndividualFee
	 * Fees1.mmIndividualFee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmIndividualFee
	 * TotalFeesAndTaxes40.mmIndividualFee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FeeAndTax1, List<Fee1>> mmIndividualFee = new MMMessageAssociationEnd<FeeAndTax1, List<Fee1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.FeeAndTax1.mmObject();
			isDerived = false;
			xmlTag = "IndvFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualFee";
			definition = "Individual fee (charge/commission).";
			nextVersions_lazy = () -> Arrays.asList(Fees1.mmIndividualFee);
			previousVersion_lazy = () -> TotalFeesAndTaxes40.mmIndividualFee;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Fee1.mmObject();
		}

		@Override
		public List<Fee1> getValue(FeeAndTax1 obj) {
			return obj.getIndividualFee();
		}

		@Override
		public void setValue(FeeAndTax1 obj, List<Fee1> value) {
			obj.setIndividualFee(value);
		}
	};
	@XmlElement(name = "IndvTax")
	protected List<Tax30> individualTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax30 Tax30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.FeeAndTax1
	 * FeeAndTax1}</li>
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
	 * definition} = "Individual tax amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40#mmIndividualTax
	 * TotalFeesAndTaxes40.mmIndividualTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FeeAndTax1, List<Tax30>> mmIndividualTax = new MMMessageAssociationEnd<FeeAndTax1, List<Tax30>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FeeAndTax1.mmObject();
			isDerived = false;
			xmlTag = "IndvTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualTax";
			definition = "Individual tax amount.";
			previousVersion_lazy = () -> TotalFeesAndTaxes40.mmIndividualTax;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Tax30.mmObject();
		}

		@Override
		public List<Tax30> getValue(FeeAndTax1 obj) {
			return obj.getIndividualTax();
		}

		@Override
		public void setValue(FeeAndTax1 obj, List<Tax30> value) {
			obj.setIndividualTax(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FeeAndTax1.mmCommercialAgreementReference, com.tools20022.repository.msg.FeeAndTax1.mmIndividualFee,
						com.tools20022.repository.msg.FeeAndTax1.mmIndividualTax);
				trace_lazy = () -> InvestmentFundTax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFeeTaxElementRule.forFeeAndTax1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FeeAndTax1";
				definition = "Amount of money associated with a service.";
				nextVersions_lazy = () -> Arrays.asList(Fees1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getCommercialAgreementReference() {
		return commercialAgreementReference == null ? Optional.empty() : Optional.of(commercialAgreementReference);
	}

	public FeeAndTax1 setCommercialAgreementReference(Max35Text commercialAgreementReference) {
		this.commercialAgreementReference = commercialAgreementReference;
		return this;
	}

	public List<Fee1> getIndividualFee() {
		return individualFee == null ? individualFee = new ArrayList<>() : individualFee;
	}

	public FeeAndTax1 setIndividualFee(List<Fee1> individualFee) {
		this.individualFee = Objects.requireNonNull(individualFee);
		return this;
	}

	public List<Tax30> getIndividualTax() {
		return individualTax == null ? individualTax = new ArrayList<>() : individualTax;
	}

	public FeeAndTax1 setIndividualTax(List<Tax30> individualTax) {
		this.individualTax = Objects.requireNonNull(individualTax);
		return this;
	}
}