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
import com.tools20022.repository.choice.GeneralBusinessOrError1Choice;
import com.tools20022.repository.choice.GeneralBusinessOrError2Choice;
import com.tools20022.repository.choice.GeneralBusinessOrError3Choice;
import com.tools20022.repository.choice.GeneralBusinessOrError4Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Details about business information related to a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemBusinessInformation"
 * src="doc-files/SystemBusinessInformation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#Qualifier
 * SystemBusinessInformation.Qualifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#Subject
 * SystemBusinessInformation.Subject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#SubjectDetails
 * SystemBusinessInformation.SubjectDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#Identification
 * SystemBusinessInformation.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#Reference
 * SystemBusinessInformation.Reference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#System
 * SystemBusinessInformation.System}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#SystemGeneratedInformation
 * System.SystemGeneratedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationQualifier#SystemBusinessInformation
 * InformationQualifier.SystemBusinessInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport#GeneralBusinessInformation
 * GeneralBusinessReport.GeneralBusinessInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2#GeneralBusinessInformation
 * GeneralBusinessReport2.GeneralBusinessInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport3#GeneralBusinessOrError
 * GeneralBusinessReport3.GeneralBusinessOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport4#GeneralBusinessOrError
 * GeneralBusinessReport4.GeneralBusinessOrError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralBusinessInformation
 * GeneralBusinessInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralBusinessReport
 * GeneralBusinessReport}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralBusinessReport2
 * GeneralBusinessReport2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneralBusinessOrError2Choice
 * GeneralBusinessOrError2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralBusinessReport3
 * GeneralBusinessReport3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneralBusinessOrError1Choice
 * GeneralBusinessOrError1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria
 * GeneralBusinessInformationSearchCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneralBusinessOrError3Choice
 * GeneralBusinessOrError3Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GeneralBusinessOrError4Choice
 * GeneralBusinessOrError4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GeneralBusinessReport4
 * GeneralBusinessReport4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemBusinessInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details about business information related to a system."</li>
 * </ul>
 */
public class SystemBusinessInformation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Further information about the criticality or importance of a general
	 * business information system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationQualifier#SystemBusinessInformation
	 * InformationQualifier.SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationQualifier
	 * InformationQualifier}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformation#Qualifier
	 * GeneralBusinessInformation.Qualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria#Qualifier
	 * GeneralBusinessInformationSearchCriteria.Qualifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Qualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information about the criticality or importance of a general business information system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Qualifier = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessInformation.Qualifier, com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria.Qualifier);
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Qualifier";
			definition = "Further information about the criticality or importance of a general business information system.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InformationQualifier.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InformationQualifier.SystemBusinessInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Subject line of an item of general business information, summarizing the
	 * topic and intended destination of the information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformation#Subject
	 * GeneralBusinessInformation.Subject}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria#Subject
	 * GeneralBusinessInformationSearchCriteria.Subject}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subject line of an item of general business information, summarizing the topic and intended destination of the information."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Subject = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessInformation.Subject, com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria.Subject);
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Subject";
			definition = "Subject line of an item of general business information, summarizing the topic and intended destination of the information.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * General business information, in unstructured form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformation#SubjectDetails
	 * GeneralBusinessInformation.SubjectDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General business information, in unstructured form."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubjectDetails = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessInformation.SubjectDetails);
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubjectDetails";
			definition = "General business information, in unstructured form.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous identification of a general business information
	 * system, as assigned by the system transaction administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport#BusinessInformationReference
	 * GeneralBusinessReport.BusinessInformationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport2#BusinessInformationReference
	 * GeneralBusinessReport2.BusinessInformationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport3#BusinessInformationReference
	 * GeneralBusinessReport3.BusinessInformationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessReport4#BusinessInformationReference
	 * GeneralBusinessReport4.BusinessInformationReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a general business information system, as assigned by the system transaction administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessReport.BusinessInformationReference, com.tools20022.repository.msg.GeneralBusinessReport2.BusinessInformationReference,
					com.tools20022.repository.msg.GeneralBusinessReport3.BusinessInformationReference, com.tools20022.repository.msg.GeneralBusinessReport4.BusinessInformationReference);
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification of a general business information system, as assigned by the system transaction administrator.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique and unambiguous reference assigned to a general business
	 * information system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria#Reference
	 * GeneralBusinessInformationSearchCriteria.Reference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous reference assigned to a general business information system."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Reference = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria.Reference);
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Reference";
			definition = "Unique and unambiguous reference assigned to a general business information system.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * System for which business information is generated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#SystemGeneratedInformation
	 * System.SystemGeneratedInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "System"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System for which business information is generated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd System = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SystemBusinessInformation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "System";
			definition = "System for which business information is generated.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.System.SystemGeneratedInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemBusinessInformation";
				definition = "Details about business information related to a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.SystemGeneratedInformation, com.tools20022.repository.entity.InformationQualifier.SystemBusinessInformation);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessReport.GeneralBusinessInformation, com.tools20022.repository.msg.GeneralBusinessReport2.GeneralBusinessInformation,
						com.tools20022.repository.msg.GeneralBusinessReport3.GeneralBusinessOrError, com.tools20022.repository.msg.GeneralBusinessReport4.GeneralBusinessOrError);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemBusinessInformation.Qualifier, com.tools20022.repository.entity.SystemBusinessInformation.Subject,
						com.tools20022.repository.entity.SystemBusinessInformation.SubjectDetails, com.tools20022.repository.entity.SystemBusinessInformation.Identification,
						com.tools20022.repository.entity.SystemBusinessInformation.Reference, com.tools20022.repository.entity.SystemBusinessInformation.System);
				derivationComponent_lazy = () -> Arrays.asList(GeneralBusinessInformation.mmObject(), GeneralBusinessReport.mmObject(), GeneralBusinessReport2.mmObject(), GeneralBusinessOrError2Choice.mmObject(),
						GeneralBusinessReport3.mmObject(), GeneralBusinessOrError1Choice.mmObject(), GeneralBusinessInformationSearchCriteria.mmObject(), GeneralBusinessOrError3Choice.mmObject(), GeneralBusinessOrError4Choice.mmObject(),
						GeneralBusinessReport4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}