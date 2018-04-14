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
import com.tools20022.repository.codeset.ERISAEligibility1Code;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.BeneficialOwner;
import com.tools20022.repository.entity.Person;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IndividualPerson15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the beneficial owner.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#mmBeneficiaryIdentification
 * BeneficiaryInformation1.mmBeneficiaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#mmERISAEligibility
 * BeneficiaryInformation1.mmERISAEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#mmERISARate
 * BeneficiaryInformation1.mmERISARate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#mmBenefitPlanDeclarationIndicator
 * BeneficiaryInformation1.mmBenefitPlanDeclarationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1#mmNoChangeToBeneficiaryDetailsIndicator
 * BeneficiaryInformation1.mmNoChangeToBeneficiaryDetailsIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BeneficialOwner
 * BeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BeneficiaryInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the beneficial owner."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintERISAEligibilityRule#forBeneficiaryInformation1
 * ConstraintERISAEligibilityRule.forBeneficiaryInformation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BeneficiaryInformation1", propOrder = {"beneficiaryIdentification", "eRISAEligibility", "eRISARate", "benefitPlanDeclarationIndicator", "noChangeToBeneficiaryDetailsIndicator"})
public class BeneficiaryInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BnfcryId")
	protected IndividualPerson15 beneficiaryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson15
	 * IndividualPerson15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1
	 * BeneficiaryInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the beneficial owner."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BeneficiaryInformation1, Optional<IndividualPerson15>> mmBeneficiaryIdentification = new MMMessageAssociationEnd<BeneficiaryInformation1, Optional<IndividualPerson15>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficiaryInformation1.mmObject();
			isDerived = false;
			xmlTag = "BnfcryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryIdentification";
			definition = "Identification of the beneficial owner.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndividualPerson15.mmObject();
		}

		@Override
		public Optional<IndividualPerson15> getValue(BeneficiaryInformation1 obj) {
			return obj.getBeneficiaryIdentification();
		}

		@Override
		public void setValue(BeneficiaryInformation1 obj, Optional<IndividualPerson15> value) {
			obj.setBeneficiaryIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ERISAElgblty", required = true)
	protected ERISAEligibility1Code eRISAEligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ERISAEligibility1Code
	 * ERISAEligibility1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmERISAEligibility
	 * BeneficialOwner.mmERISAEligibility}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1
	 * BeneficiaryInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ERISAElgblty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISAEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligibility to federal Employee Retirement Income Security Act."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficiaryInformation1, ERISAEligibility1Code> mmERISAEligibility = new MMMessageAttribute<BeneficiaryInformation1, ERISAEligibility1Code>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmERISAEligibility;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficiaryInformation1.mmObject();
			isDerived = false;
			xmlTag = "ERISAElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISAEligibility";
			definition = "Eligibility to federal Employee Retirement Income Security Act.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ERISAEligibility1Code.mmObject();
		}

		@Override
		public ERISAEligibility1Code getValue(BeneficiaryInformation1 obj) {
			return obj.getERISAEligibility();
		}

		@Override
		public void setValue(BeneficiaryInformation1 obj, ERISAEligibility1Code value) {
			obj.setERISAEligibility(value);
		}
	};
	@XmlElement(name = "ERISARate")
	protected PercentageRate eRISARate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmERISARate
	 * BeneficialOwner.mmERISARate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1
	 * BeneficiaryInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ERISARate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISARate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Federal Employee Retirement Income Security Act (ERISA) rate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficiaryInformation1, Optional<PercentageRate>> mmERISARate = new MMMessageAttribute<BeneficiaryInformation1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmERISARate;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficiaryInformation1.mmObject();
			isDerived = false;
			xmlTag = "ERISARate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISARate";
			definition = "Federal Employee Retirement Income Security Act (ERISA) rate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(BeneficiaryInformation1 obj) {
			return obj.getERISARate();
		}

		@Override
		public void setValue(BeneficiaryInformation1 obj, Optional<PercentageRate> value) {
			obj.setERISARate(value.orElse(null));
		}
	};
	@XmlElement(name = "BnftPlanDclrtnInd", required = true)
	protected YesNoIndicator benefitPlanDeclarationIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmBenefitPlanDeclarationIndicator
	 * BeneficialOwner.mmBenefitPlanDeclarationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1
	 * BeneficiaryInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnftPlanDclrtnInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenefitPlanDeclarationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor is a benefit plan investor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficiaryInformation1, YesNoIndicator> mmBenefitPlanDeclarationIndicator = new MMMessageAttribute<BeneficiaryInformation1, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmBenefitPlanDeclarationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficiaryInformation1.mmObject();
			isDerived = false;
			xmlTag = "BnftPlanDclrtnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenefitPlanDeclarationIndicator";
			definition = "Indicates whether the investor is a benefit plan investor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(BeneficiaryInformation1 obj) {
			return obj.getBenefitPlanDeclarationIndicator();
		}

		@Override
		public void setValue(BeneficiaryInformation1 obj, YesNoIndicator value) {
			obj.setBenefitPlanDeclarationIndicator(value);
		}
	};
	@XmlElement(name = "NoChngToBnfcryDtlsInd", required = true)
	protected YesNoIndicator noChangeToBeneficiaryDetailsIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation1
	 * BeneficiaryInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoChngToBnfcryDtlsInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoChangeToBeneficiaryDetailsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that there has been no change to the beneficiary's details, such as domicile, investor status, etc, as represented in the initial subscription document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BeneficiaryInformation1, YesNoIndicator> mmNoChangeToBeneficiaryDetailsIndicator = new MMMessageAttribute<BeneficiaryInformation1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BeneficiaryInformation1.mmObject();
			isDerived = false;
			xmlTag = "NoChngToBnfcryDtlsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoChangeToBeneficiaryDetailsIndicator";
			definition = "Indicates that there has been no change to the beneficiary's details, such as domicile, investor status, etc, as represented in the initial subscription document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(BeneficiaryInformation1 obj) {
			return obj.getNoChangeToBeneficiaryDetailsIndicator();
		}

		@Override
		public void setValue(BeneficiaryInformation1 obj, YesNoIndicator value) {
			obj.setNoChangeToBeneficiaryDetailsIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BeneficiaryInformation1.mmBeneficiaryIdentification, com.tools20022.repository.msg.BeneficiaryInformation1.mmERISAEligibility,
						com.tools20022.repository.msg.BeneficiaryInformation1.mmERISARate, com.tools20022.repository.msg.BeneficiaryInformation1.mmBenefitPlanDeclarationIndicator,
						com.tools20022.repository.msg.BeneficiaryInformation1.mmNoChangeToBeneficiaryDetailsIndicator);
				trace_lazy = () -> BeneficialOwner.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintERISAEligibilityRule.forBeneficiaryInformation1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BeneficiaryInformation1";
				definition = "Information about the beneficial owner.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<IndividualPerson15> getBeneficiaryIdentification() {
		return beneficiaryIdentification == null ? Optional.empty() : Optional.of(beneficiaryIdentification);
	}

	public BeneficiaryInformation1 setBeneficiaryIdentification(IndividualPerson15 beneficiaryIdentification) {
		this.beneficiaryIdentification = beneficiaryIdentification;
		return this;
	}

	public ERISAEligibility1Code getERISAEligibility() {
		return eRISAEligibility;
	}

	public BeneficiaryInformation1 setERISAEligibility(ERISAEligibility1Code eRISAEligibility) {
		this.eRISAEligibility = Objects.requireNonNull(eRISAEligibility);
		return this;
	}

	public Optional<PercentageRate> getERISARate() {
		return eRISARate == null ? Optional.empty() : Optional.of(eRISARate);
	}

	public BeneficiaryInformation1 setERISARate(PercentageRate eRISARate) {
		this.eRISARate = eRISARate;
		return this;
	}

	public YesNoIndicator getBenefitPlanDeclarationIndicator() {
		return benefitPlanDeclarationIndicator;
	}

	public BeneficiaryInformation1 setBenefitPlanDeclarationIndicator(YesNoIndicator benefitPlanDeclarationIndicator) {
		this.benefitPlanDeclarationIndicator = Objects.requireNonNull(benefitPlanDeclarationIndicator);
		return this;
	}

	public YesNoIndicator getNoChangeToBeneficiaryDetailsIndicator() {
		return noChangeToBeneficiaryDetailsIndicator;
	}

	public BeneficiaryInformation1 setNoChangeToBeneficiaryDetailsIndicator(YesNoIndicator noChangeToBeneficiaryDetailsIndicator) {
		this.noChangeToBeneficiaryDetailsIndicator = Objects.requireNonNull(noChangeToBeneficiaryDetailsIndicator);
		return this;
	}
}