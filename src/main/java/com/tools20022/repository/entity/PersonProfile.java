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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information to support Know Your Customer (KYC) processes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PersonProfile" src="doc-files/PersonProfile.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmForeignStatusCertification
 * PersonProfile.mmForeignStatusCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmEmployeeTerminationIndicator
 * PersonProfile.mmEmployeeTerminationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmKnowYourCustomerCheckType
 * PersonProfile.mmKnowYourCustomerCheckType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#mmRiskLevel
 * PersonProfile.mmRiskLevel}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#mmPerson
 * PersonProfile.mmPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmPoliticalExposureType
 * PersonProfile.mmPoliticalExposureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmCustomerConductClassification
 * PersonProfile.mmCustomerConductClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmFamilyMedicalInsuranceIndicator
 * PersonProfile.mmFamilyMedicalInsuranceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmProfileCertification
 * PersonProfile.mmProfileCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmSourceOfWealth
 * PersonProfile.mmSourceOfWealth}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PersonProfile#mmSalaryRange
 * PersonProfile.mmSalaryRange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Person#mmPersonProfile
 * Person.mmPersonProfile}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PrivateCertificate#mmPerson
 * PrivateCertificate.mmPerson}</li>
 * </ul>
 * </li>
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
 * "PersonProfile"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information to support Know Your Customer (KYC) processes."</li>
 * </ul>
 */
public class PersonProfile {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ProvidedCode foreignStatusCertification;
	/**
	 * Specifies if documentary evidence has been provided for the foreign
	 * resident.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ProvidedCode
	 * ProvidedCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignStatusCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if documentary evidence has been provided for the foreign resident."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmForeignStatusCertification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignStatusCertification";
			definition = "Specifies if documentary evidence has been provided for the foreign resident.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProvidedCode.mmObject();
		}
	};
	protected YesNoIndicator employeeTerminationIndicator;
	/**
	 * Indicates if the employment of the person has been terminated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmEmployeeTerminationIndicator
	 * Garnishment1.mmEmployeeTerminationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeTerminationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the employment of the person has been terminated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEmployeeTerminationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Garnishment1.mmEmployeeTerminationIndicator);
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EmployeeTerminationIndicator";
			definition = "Indicates if the employment of the person has been terminated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected KnowYourCustomerCheckTypeCode knowYourCustomerCheckType;
	/**
	 * Specifies the type of due diligence checks carried out on a party. For
	 * definitions of ordinary, simple and enhanced know your customer checks,
	 * local market regulations should be consulted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckTypeCode
	 * KnowYourCustomerCheckTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmKnowYourCustomerCheckType
	 * PartyProfileInformation3.mmKnowYourCustomerCheckType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.KYCCheckType1Choice#mmCode
	 * KYCCheckType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.KYCCheckType1Choice#mmProprietary
	 * KYCCheckType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmKnowYourCustomerCheckType
	 * PartyProfileInformation4.mmKnowYourCustomerCheckType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmKnowYourCustomerCheckType
	 * PartyProfileInformation5.mmKnowYourCustomerCheckType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KnowYourCustomerCheckType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of due diligence checks carried out on a party. For definitions of ordinary, simple and enhanced know your customer checks, local market regulations should be consulted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmKnowYourCustomerCheckType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyProfileInformation3.mmKnowYourCustomerCheckType, com.tools20022.repository.choice.KYCCheckType1Choice.mmCode,
					com.tools20022.repository.choice.KYCCheckType1Choice.mmProprietary, com.tools20022.repository.msg.PartyProfileInformation4.mmKnowYourCustomerCheckType,
					com.tools20022.repository.msg.PartyProfileInformation5.mmKnowYourCustomerCheckType);
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "KnowYourCustomerCheckType";
			definition = "Specifies the type of due diligence checks carried out on a party. For definitions of ordinary, simple and enhanced know your customer checks, local market regulations should be consulted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> KnowYourCustomerCheckTypeCode.mmObject();
		}
	};
	protected RiskLevelCode riskLevel;
	/**
	 * Specifies the customer’s money laundering risk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RiskLevelCode
	 * RiskLevelCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the customer’s money laundering risk."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRiskLevel = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RiskLevel";
			definition = "Specifies the customer’s money laundering risk.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RiskLevelCode.mmObject();
		}
	};
	protected Person person;
	/**
	 * Person for which the profile parameters are described.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPersonProfile
	 * Person.mmPersonProfile}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Person"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person for which the profile parameters are described."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPerson = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Person";
			definition = "Person for which the profile parameters are described.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Person.mmPersonProfile;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Person.mmObject();
		}
	};
	protected PoliticalExposureTypeCode politicalExposureType;
	/**
	 * Specifies if due diligence checks on the political exposure of the
	 * investor have been carried out and whether these checks are national or
	 * foreign. (A politically exposed person is someone who has been entrusted
	 * with a prominent public function, or an individual who is closely related
	 * to such a person.)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureTypeCode
	 * PoliticalExposureTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmPoliticallyExposedPersonType
	 * IndividualPerson21.mmPoliticallyExposedPersonType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PoliticalExposureType1Choice#mmCode
	 * PoliticalExposureType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PoliticalExposureType1Choice#mmProprietary
	 * PoliticalExposureType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmPoliticallyExposedPersonType
	 * IndividualPerson22.mmPoliticallyExposedPersonType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmPoliticallyExposedPersonType
	 * IndividualPerson23.mmPoliticallyExposedPersonType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmPoliticallyExposedPersonType
	 * IndividualPerson24.mmPoliticallyExposedPersonType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson28#mmPoliticallyExposedPersonType
	 * IndividualPerson28.mmPoliticallyExposedPersonType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson27#mmPoliticallyExposedPersonType
	 * IndividualPerson27.mmPoliticallyExposedPersonType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson33#mmPoliticallyExposedPersonType
	 * IndividualPerson33.mmPoliticallyExposedPersonType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson34#mmPoliticallyExposedPersonType
	 * IndividualPerson34.mmPoliticallyExposedPersonType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoliticalExposureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if due diligence checks on the political exposure of the investor have been carried out and whether these checks are national or foreign. (A politically exposed person is someone who has been entrusted with a prominent public function, or an individual who is closely related to such a person.)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPoliticalExposureType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson21.mmPoliticallyExposedPersonType, com.tools20022.repository.choice.PoliticalExposureType1Choice.mmCode,
					com.tools20022.repository.choice.PoliticalExposureType1Choice.mmProprietary, com.tools20022.repository.msg.IndividualPerson22.mmPoliticallyExposedPersonType,
					com.tools20022.repository.msg.IndividualPerson23.mmPoliticallyExposedPersonType, com.tools20022.repository.msg.IndividualPerson24.mmPoliticallyExposedPersonType,
					com.tools20022.repository.msg.IndividualPerson28.mmPoliticallyExposedPersonType, com.tools20022.repository.msg.IndividualPerson27.mmPoliticallyExposedPersonType,
					com.tools20022.repository.msg.IndividualPerson33.mmPoliticallyExposedPersonType, com.tools20022.repository.msg.IndividualPerson34.mmPoliticallyExposedPersonType);
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoliticalExposureType";
			definition = "Specifies if due diligence checks on the political exposure of the investor have been carried out and whether these checks are national or foreign. (A politically exposed person is someone who has been entrusted with a prominent public function, or an individual who is closely related to such a person.)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PoliticalExposureTypeCode.mmObject();
		}
	};
	protected ConductClassificationCode customerConductClassification;
	/**
	 * Assessment of the customer’s behaviour at the time of the account opening
	 * application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConductClassificationCode
	 * ConductClassificationCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerConductClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assessment of the customer’s behaviour at the time of the account opening application."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCustomerConductClassification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CustomerConductClassification";
			definition = "Assessment of the customer’s behaviour at the time of the account opening application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConductClassificationCode.mmObject();
		}
	};
	protected YesNoIndicator familyMedicalInsuranceIndicator;
	/**
	 * Indicates if the person has family medical insurance coverage available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmFamilyMedicalInsuranceIndicator
	 * Garnishment1.mmFamilyMedicalInsuranceIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FamilyMedicalInsuranceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the person has family medical insurance coverage available. "
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFamilyMedicalInsuranceIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Garnishment1.mmFamilyMedicalInsuranceIndicator);
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FamilyMedicalInsuranceIndicator";
			definition = "Indicates if the person has family medical insurance coverage available. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PrivateCertificate> profileCertification;
	/**
	 * Information to support the Know Your Customer processes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PrivateCertificate#mmPerson
	 * PrivateCertificate.mmPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PrivateCertificate
	 * PrivateCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6#mmInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation6.mmInvestorProfileValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7#mmModifiedInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation7.
	 * mmModifiedInvestorProfileValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8#mmModifiedInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation8.
	 * mmModifiedInvestorProfileValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9#mmInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation9.mmInvestorProfileValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation10.mmInvestorProfileValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmModifiedInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation11.
	 * mmModifiedInvestorProfileValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation12.mmInvestorProfileValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmModifiedInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation13.
	 * mmModifiedInvestorProfileValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmModifiedInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation15.
	 * mmModifiedInvestorProfileValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation14.mmInvestorProfileValidation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information to support the Know Your Customer processes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProfileCertification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmInvestorProfileValidation,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmModifiedInvestorProfileValidation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation8.mmModifiedInvestorProfileValidation,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9.mmInvestorProfileValidation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10.mmInvestorProfileValidation,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11.mmModifiedInvestorProfileValidation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmInvestorProfileValidation,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13.mmModifiedInvestorProfileValidation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmModifiedInvestorProfileValidation,
					com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmInvestorProfileValidation);
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProfileCertification";
			definition = "Information to support the Know Your Customer processes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmPerson;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PrivateCertificate.mmObject();
		}
	};
	protected Max140Text sourceOfWealth;
	/**
	 * Indicates the main sources of the money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmSourceOfWealth
	 * PartyProfileInformation1.mmSourceOfWealth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmSourceOfWealth
	 * PartyProfileInformation2.mmSourceOfWealth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmSourceOfWealth
	 * PartyProfileInformation3.mmSourceOfWealth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmSourceOfWealth
	 * PartyProfileInformation4.mmSourceOfWealth}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmSourceOfWealth
	 * PartyProfileInformation5.mmSourceOfWealth}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfWealth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the main sources of the money."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSourceOfWealth = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyProfileInformation1.mmSourceOfWealth, com.tools20022.repository.msg.PartyProfileInformation2.mmSourceOfWealth,
					com.tools20022.repository.msg.PartyProfileInformation3.mmSourceOfWealth, com.tools20022.repository.msg.PartyProfileInformation4.mmSourceOfWealth, com.tools20022.repository.msg.PartyProfileInformation5.mmSourceOfWealth);
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceOfWealth";
			definition = "Indicates the main sources of the money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max35Text salaryRange;
	/**
	 * Specifies the level of salary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile PersonProfile}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation1#mmSalaryRange
	 * PartyProfileInformation1.mmSalaryRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation2#mmSalaryRange
	 * PartyProfileInformation2.mmSalaryRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation3#mmSalaryRange
	 * PartyProfileInformation3.mmSalaryRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation4#mmSalaryRange
	 * PartyProfileInformation4.mmSalaryRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5#mmSalaryRange
	 * PartyProfileInformation5.mmSalaryRange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryRange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the level of salary."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSalaryRange = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyProfileInformation1.mmSalaryRange, com.tools20022.repository.msg.PartyProfileInformation2.mmSalaryRange,
					com.tools20022.repository.msg.PartyProfileInformation3.mmSalaryRange, com.tools20022.repository.msg.PartyProfileInformation4.mmSalaryRange, com.tools20022.repository.msg.PartyProfileInformation5.mmSalaryRange);
			elementContext_lazy = () -> PersonProfile.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SalaryRange";
			definition = "Specifies the level of salary.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PersonProfile";
				definition = "Information to support Know Your Customer (KYC) processes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Person.mmPersonProfile, com.tools20022.repository.entity.PrivateCertificate.mmPerson);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PersonProfile.mmForeignStatusCertification, com.tools20022.repository.entity.PersonProfile.mmEmployeeTerminationIndicator,
						com.tools20022.repository.entity.PersonProfile.mmKnowYourCustomerCheckType, com.tools20022.repository.entity.PersonProfile.mmRiskLevel, com.tools20022.repository.entity.PersonProfile.mmPerson,
						com.tools20022.repository.entity.PersonProfile.mmPoliticalExposureType, com.tools20022.repository.entity.PersonProfile.mmCustomerConductClassification,
						com.tools20022.repository.entity.PersonProfile.mmFamilyMedicalInsuranceIndicator, com.tools20022.repository.entity.PersonProfile.mmProfileCertification,
						com.tools20022.repository.entity.PersonProfile.mmSourceOfWealth, com.tools20022.repository.entity.PersonProfile.mmSalaryRange);
			}
		});
		return mmObject_lazy.get();
	}

	public ProvidedCode getForeignStatusCertification() {
		return foreignStatusCertification;
	}

	public void setForeignStatusCertification(ProvidedCode foreignStatusCertification) {
		this.foreignStatusCertification = foreignStatusCertification;
	}

	public YesNoIndicator getEmployeeTerminationIndicator() {
		return employeeTerminationIndicator;
	}

	public void setEmployeeTerminationIndicator(YesNoIndicator employeeTerminationIndicator) {
		this.employeeTerminationIndicator = employeeTerminationIndicator;
	}

	public KnowYourCustomerCheckTypeCode getKnowYourCustomerCheckType() {
		return knowYourCustomerCheckType;
	}

	public void setKnowYourCustomerCheckType(KnowYourCustomerCheckTypeCode knowYourCustomerCheckType) {
		this.knowYourCustomerCheckType = knowYourCustomerCheckType;
	}

	public RiskLevelCode getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(RiskLevelCode riskLevel) {
		this.riskLevel = riskLevel;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(com.tools20022.repository.entity.Person person) {
		this.person = person;
	}

	public PoliticalExposureTypeCode getPoliticalExposureType() {
		return politicalExposureType;
	}

	public void setPoliticalExposureType(PoliticalExposureTypeCode politicalExposureType) {
		this.politicalExposureType = politicalExposureType;
	}

	public ConductClassificationCode getCustomerConductClassification() {
		return customerConductClassification;
	}

	public void setCustomerConductClassification(ConductClassificationCode customerConductClassification) {
		this.customerConductClassification = customerConductClassification;
	}

	public YesNoIndicator getFamilyMedicalInsuranceIndicator() {
		return familyMedicalInsuranceIndicator;
	}

	public void setFamilyMedicalInsuranceIndicator(YesNoIndicator familyMedicalInsuranceIndicator) {
		this.familyMedicalInsuranceIndicator = familyMedicalInsuranceIndicator;
	}

	public List<PrivateCertificate> getProfileCertification() {
		return profileCertification;
	}

	public void setProfileCertification(List<com.tools20022.repository.entity.PrivateCertificate> profileCertification) {
		this.profileCertification = profileCertification;
	}

	public Max140Text getSourceOfWealth() {
		return sourceOfWealth;
	}

	public void setSourceOfWealth(Max140Text sourceOfWealth) {
		this.sourceOfWealth = sourceOfWealth;
	}

	public Max35Text getSalaryRange() {
		return salaryRange;
	}

	public void setSalaryRange(Max35Text salaryRange) {
		this.salaryRange = salaryRange;
	}
}