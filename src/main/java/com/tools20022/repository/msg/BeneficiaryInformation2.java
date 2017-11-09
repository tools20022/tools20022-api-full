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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#mmBeneficiaryIdentification
 * BeneficiaryInformation2.mmBeneficiaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#mmERISAEligibility
 * BeneficiaryInformation2.mmERISAEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#mmERISARate
 * BeneficiaryInformation2.mmERISARate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#mmBenefitPlanDeclarationIndicator
 * BeneficiaryInformation2.mmBenefitPlanDeclarationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2#mmNoChangeToBeneficiaryDetailsIndicator
 * BeneficiaryInformation2.mmNoChangeToBeneficiaryDetailsIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BeneficialOwner
 * BeneficialOwner}</li>
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
 * "BeneficiaryInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the beneficial owner."</li>
 * </ul>
 */
public class BeneficiaryInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected IndividualPerson15 beneficiaryIdentification;
	/**
	 * Identification of the beneficial owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2
	 * BeneficiaryInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the beneficial owner."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiaryIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> BeneficiaryInformation2.mmObject();
			isDerived = false;
			xmlTag = "BnfcryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryIdentification";
			definition = "Identification of the beneficial owner.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IndividualPerson15.mmObject();
		}
	};
	protected ERISAEligibility1Code eRISAEligibility;
	/**
	 * Eligibility to federal Employee Retirement Income Security Act.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2
	 * BeneficiaryInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ERISAElgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISAEligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Eligibility to federal Employee Retirement Income Security Act."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmERISAEligibility = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmERISAEligibility;
			componentContext_lazy = () -> BeneficiaryInformation2.mmObject();
			isDerived = false;
			xmlTag = "ERISAElgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISAEligibility";
			definition = "Eligibility to federal Employee Retirement Income Security Act.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ERISAEligibility1Code.mmObject();
		}
	};
	protected PercentageRate eRISARate;
	/**
	 * Federal Employee Retirement Income Security Act (ERISA) rate.
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
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmERISARate
	 * BeneficialOwner.mmERISARate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2
	 * BeneficiaryInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ERISARate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISARate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Federal Employee Retirement Income Security Act (ERISA) rate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmERISARate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmERISARate;
			componentContext_lazy = () -> BeneficiaryInformation2.mmObject();
			isDerived = false;
			xmlTag = "ERISARate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISARate";
			definition = "Federal Employee Retirement Income Security Act (ERISA) rate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected YesNoIndicator benefitPlanDeclarationIndicator;
	/**
	 * Indicates whether the investor is a benefit plan investor.
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
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmBenefitPlanDeclarationIndicator
	 * BeneficialOwner.mmBenefitPlanDeclarationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2
	 * BeneficiaryInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnftPlanDclrtnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BenefitPlanDeclarationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the investor is a benefit plan investor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBenefitPlanDeclarationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmBenefitPlanDeclarationIndicator;
			componentContext_lazy = () -> BeneficiaryInformation2.mmObject();
			isDerived = false;
			xmlTag = "BnftPlanDclrtnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BenefitPlanDeclarationIndicator";
			definition = "Indicates whether the investor is a benefit plan investor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator noChangeToBeneficiaryDetailsIndicator;
	/**
	 * Indicates that there has been no change to the beneficiary's details,
	 * such as domicile, investor status, etc, as represented in the initial
	 * subscription document.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BeneficiaryInformation2
	 * BeneficiaryInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoChngToBnfcryDtlsInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoChangeToBeneficiaryDetailsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that there has been no change to the beneficiary's details, such as domicile, investor status, etc, as represented in the initial subscription document."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNoChangeToBeneficiaryDetailsIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BeneficiaryInformation2.mmObject();
			isDerived = false;
			xmlTag = "NoChngToBnfcryDtlsInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoChangeToBeneficiaryDetailsIndicator";
			definition = "Indicates that there has been no change to the beneficiary's details, such as domicile, investor status, etc, as represented in the initial subscription document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BeneficiaryInformation2.mmBeneficiaryIdentification, BeneficiaryInformation2.mmERISAEligibility, BeneficiaryInformation2.mmERISARate,
						BeneficiaryInformation2.mmBenefitPlanDeclarationIndicator, BeneficiaryInformation2.mmNoChangeToBeneficiaryDetailsIndicator);
				trace_lazy = () -> BeneficialOwner.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BeneficiaryInformation2";
				definition = "Information about the beneficial owner.";
			}
		});
		return mmObject_lazy.get();
	}

	public IndividualPerson15 getBeneficiaryIdentification() {
		return beneficiaryIdentification;
	}

	public void setBeneficiaryIdentification(com.tools20022.repository.msg.IndividualPerson15 beneficiaryIdentification) {
		this.beneficiaryIdentification = beneficiaryIdentification;
	}

	public ERISAEligibility1Code getERISAEligibility() {
		return eRISAEligibility;
	}

	public void setERISAEligibility(ERISAEligibility1Code eRISAEligibility) {
		this.eRISAEligibility = eRISAEligibility;
	}

	public PercentageRate getERISARate() {
		return eRISARate;
	}

	public void setERISARate(PercentageRate eRISARate) {
		this.eRISARate = eRISARate;
	}

	public YesNoIndicator getBenefitPlanDeclarationIndicator() {
		return benefitPlanDeclarationIndicator;
	}

	public void setBenefitPlanDeclarationIndicator(YesNoIndicator benefitPlanDeclarationIndicator) {
		this.benefitPlanDeclarationIndicator = benefitPlanDeclarationIndicator;
	}

	public YesNoIndicator getNoChangeToBeneficiaryDetailsIndicator() {
		return noChangeToBeneficiaryDetailsIndicator;
	}

	public void setNoChangeToBeneficiaryDetailsIndicator(YesNoIndicator noChangeToBeneficiaryDetailsIndicator) {
		this.noChangeToBeneficiaryDetailsIndicator = noChangeToBeneficiaryDetailsIndicator;
	}
}