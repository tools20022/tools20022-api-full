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
import com.tools20022.repository.codeset.DataSetCategory6Code;
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information on the delegation of a maintenance action or maintenance
 * function.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmMaintenanceService
 * MaintenanceDelegation1.mmMaintenanceService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmPartialDelegation
 * MaintenanceDelegation1.mmPartialDelegation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmPOISubset
 * MaintenanceDelegation1.mmPOISubset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmDelegatedAction
 * MaintenanceDelegation1.mmDelegatedAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmParametersSubsetIdentification
 * MaintenanceDelegation1.mmParametersSubsetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmParametersSubsetDefinition
 * MaintenanceDelegation1.mmParametersSubsetDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmCertificate
 * MaintenanceDelegation1.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmPOIIdentificationAssociation
 * MaintenanceDelegation1.mmPOIIdentificationAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmSymmetricKey
 * MaintenanceDelegation1.mmSymmetricKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmParameterDataSet
 * MaintenanceDelegation1.mmParameterDataSet}</li>
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
 * "MaintenanceDelegation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information on the delegation of a maintenance action or maintenance function."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MaintenanceDelegation2
 * MaintenanceDelegation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MaintenanceDelegation3
 * MaintenanceDelegation3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MaintenanceDelegation1", propOrder = {"maintenanceService", "partialDelegation", "pOISubset", "delegatedAction", "parametersSubsetIdentification", "parametersSubsetDefinition", "certificate",
		"pOIIdentificationAssociation", "symmetricKey", "parameterDataSet"})
public class MaintenanceDelegation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MntncSvc", required = true)
	protected List<DataSetCategory6Code> maintenanceService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory6Code
	 * DataSetCategory6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1
	 * MaintenanceDelegation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntncSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaintenanceService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance service to be delegated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmMaintenanceService
	 * MaintenanceDelegation2.mmMaintenanceService}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmMaintenanceService
	 * MaintenanceDelegation3.mmMaintenanceService}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaintenanceService = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation1.mmObject();
			isDerived = false;
			xmlTag = "MntncSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceService";
			definition = "Maintenance service to be delegated.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation2.mmMaintenanceService, MaintenanceDelegation3.mmMaintenanceService);
			minOccurs = 1;
			simpleType_lazy = () -> DataSetCategory6Code.mmObject();
		}
	};
	@XmlElement(name = "PrtlDlgtn")
	protected TrueFalseIndicator partialDelegation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1
	 * MaintenanceDelegation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlDlgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDelegation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Flag to indicate that the delegated maintenance must be performed on a subset of the terminal estate. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmPartialDelegation
	 * MaintenanceDelegation3.mmPartialDelegation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialDelegation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation1.mmObject();
			isDerived = false;
			xmlTag = "PrtlDlgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDelegation";
			definition = "Flag to indicate that the delegated maintenance must be performed on a subset of the terminal estate. ";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation3.mmPartialDelegation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "POISubset")
	protected List<Max35Text> pOISubset;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1
	 * MaintenanceDelegation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POISubset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POISubset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subset of the terminal estate for the delegated actions, for instance for pilot or key deactivation). The subset may be expressed as a list of POI or terminal estate subset identifier."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmPOISubset
	 * MaintenanceDelegation2.mmPOISubset}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmPOISubset
	 * MaintenanceDelegation3.mmPOISubset}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOISubset = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation1.mmObject();
			isDerived = false;
			xmlTag = "POISubset";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POISubset";
			definition = "Subset of the terminal estate for the delegated actions, for instance for pilot or key deactivation). The subset may be expressed as a list of POI or terminal estate subset identifier.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation2.mmPOISubset, MaintenanceDelegation3.mmPOISubset);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "DlgtdActn")
	protected MaintenanceDelegateAction1 delegatedAction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction1
	 * MaintenanceDelegateAction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1
	 * MaintenanceDelegation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtdActn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegatedAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information for the MTM to build or include delegated actions in the management plan of the POI."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmDelegatedAction
	 * MaintenanceDelegation3.mmDelegatedAction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDelegatedAction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation1.mmObject();
			isDerived = false;
			xmlTag = "DlgtdActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegatedAction";
			definition = "Information for the MTM to build or include delegated actions in the management plan of the POI.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation3.mmDelegatedAction);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction1.mmObject();
		}
	};
	@XmlElement(name = "ParamsSubsetId")
	protected Max35Text parametersSubsetIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1
	 * MaintenanceDelegation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParamsSubsetId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParametersSubsetIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the parameters subset assigned by the MTM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmParametersSubsetIdentification
	 * MaintenanceDelegation2.mmParametersSubsetIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmDelegationScopeIdentification
	 * MaintenanceDelegation3.mmDelegationScopeIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParametersSubsetIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation1.mmObject();
			isDerived = false;
			xmlTag = "ParamsSubsetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParametersSubsetIdentification";
			definition = "Identification of the parameters subset assigned by the MTM.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation2.mmParametersSubsetIdentification, MaintenanceDelegation3.mmDelegationScopeIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ParamsSubsetDef")
	protected Max3000Binary parametersSubsetDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3000Binary
	 * Max3000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1
	 * MaintenanceDelegation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParamsSubsetDef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParametersSubsetDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of the subset of application parameters, for instance the range of application profiles, the RID (registered application provider identification)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmParametersSubsetDefinition
	 * MaintenanceDelegation2.mmParametersSubsetDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmDelegationScopeDefinition
	 * MaintenanceDelegation3.mmDelegationScopeDefinition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParametersSubsetDefinition = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation1.mmObject();
			isDerived = false;
			xmlTag = "ParamsSubsetDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParametersSubsetDefinition";
			definition = "Definition of the subset of application parameters, for instance the range of application profiles, the RID (registered application provider identification).";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation2.mmParametersSubsetDefinition, MaintenanceDelegation3.mmDelegationScopeDefinition);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}
	};
	@XmlElement(name = "Cert")
	protected List<Max5000Binary> certificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1
	 * MaintenanceDelegation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate path of the terminal manager."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmCertificate
	 * MaintenanceDelegation3.mmCertificate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation1.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Certificate path of the terminal manager.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation3.mmCertificate);
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};
	@XmlElement(name = "POIIdAssoctn")
	protected List<com.tools20022.repository.msg.MaintenanceIdentificationAssociation1> pOIIdentificationAssociation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceIdentificationAssociation1
	 * MaintenanceIdentificationAssociation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1
	 * MaintenanceDelegation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIIdAssoctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentificationAssociation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Association of the TM identifier and the MTM identifier of a POI."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmPOIIdentificationAssociation
	 * MaintenanceDelegation2.mmPOIIdentificationAssociation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmPOIIdentificationAssociation
	 * MaintenanceDelegation3.mmPOIIdentificationAssociation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOIIdentificationAssociation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation1.mmObject();
			isDerived = false;
			xmlTag = "POIIdAssoctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentificationAssociation";
			definition = "Association of the TM identifier and the MTM identifier of a POI.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation2.mmPOIIdentificationAssociation, MaintenanceDelegation3.mmPOIIdentificationAssociation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MaintenanceIdentificationAssociation1.mmObject();
		}
	};
	@XmlElement(name = "SmmtrcKey")
	protected List<com.tools20022.repository.msg.KEKIdentifier2> symmetricKey;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEKIdentifier2
	 * KEKIdentifier2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1
	 * MaintenanceDelegation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SmmtrcKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SymmetricKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the key to manage or to download."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmSymmetricKey
	 * MaintenanceDelegation3.mmSymmetricKey}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSymmetricKey = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation1.mmObject();
			isDerived = false;
			xmlTag = "SmmtrcKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SymmetricKey";
			definition = "Identification of the key to manage or to download.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation3.mmSymmetricKey);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.KEKIdentifier2.mmObject();
		}
	};
	@XmlElement(name = "ParamDataSet")
	protected TerminalManagementDataSet14 parameterDataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet14
	 * TerminalManagementDataSet14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1
	 * MaintenanceDelegation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ParamDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParameterDataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters of the terminal manager to be sent by the MTM."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmParameterDataSet
	 * MaintenanceDelegation3.mmParameterDataSet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParameterDataSet = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation1.mmObject();
			isDerived = false;
			xmlTag = "ParamDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParameterDataSet";
			definition = "Configuration parameters of the terminal manager to be sent by the MTM.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation3.mmParameterDataSet);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet14.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegation1.mmMaintenanceService, com.tools20022.repository.msg.MaintenanceDelegation1.mmPartialDelegation,
						com.tools20022.repository.msg.MaintenanceDelegation1.mmPOISubset, com.tools20022.repository.msg.MaintenanceDelegation1.mmDelegatedAction,
						com.tools20022.repository.msg.MaintenanceDelegation1.mmParametersSubsetIdentification, com.tools20022.repository.msg.MaintenanceDelegation1.mmParametersSubsetDefinition,
						com.tools20022.repository.msg.MaintenanceDelegation1.mmCertificate, com.tools20022.repository.msg.MaintenanceDelegation1.mmPOIIdentificationAssociation,
						com.tools20022.repository.msg.MaintenanceDelegation1.mmSymmetricKey, com.tools20022.repository.msg.MaintenanceDelegation1.mmParameterDataSet);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegation1";
				definition = "Information on the delegation of a maintenance action or maintenance function.";
				nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation2.mmObject(), MaintenanceDelegation3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<DataSetCategory6Code> getMaintenanceService() {
		return maintenanceService == null ? maintenanceService = new ArrayList<>() : maintenanceService;
	}

	public MaintenanceDelegation1 setMaintenanceService(List<DataSetCategory6Code> maintenanceService) {
		this.maintenanceService = Objects.requireNonNull(maintenanceService);
		return this;
	}

	public Optional<TrueFalseIndicator> getPartialDelegation() {
		return partialDelegation == null ? Optional.empty() : Optional.of(partialDelegation);
	}

	public MaintenanceDelegation1 setPartialDelegation(TrueFalseIndicator partialDelegation) {
		this.partialDelegation = partialDelegation;
		return this;
	}

	public List<Max35Text> getPOISubset() {
		return pOISubset == null ? pOISubset = new ArrayList<>() : pOISubset;
	}

	public MaintenanceDelegation1 setPOISubset(List<Max35Text> pOISubset) {
		this.pOISubset = Objects.requireNonNull(pOISubset);
		return this;
	}

	public Optional<MaintenanceDelegateAction1> getDelegatedAction() {
		return delegatedAction == null ? Optional.empty() : Optional.of(delegatedAction);
	}

	public MaintenanceDelegation1 setDelegatedAction(com.tools20022.repository.msg.MaintenanceDelegateAction1 delegatedAction) {
		this.delegatedAction = delegatedAction;
		return this;
	}

	public Optional<Max35Text> getParametersSubsetIdentification() {
		return parametersSubsetIdentification == null ? Optional.empty() : Optional.of(parametersSubsetIdentification);
	}

	public MaintenanceDelegation1 setParametersSubsetIdentification(Max35Text parametersSubsetIdentification) {
		this.parametersSubsetIdentification = parametersSubsetIdentification;
		return this;
	}

	public Optional<Max3000Binary> getParametersSubsetDefinition() {
		return parametersSubsetDefinition == null ? Optional.empty() : Optional.of(parametersSubsetDefinition);
	}

	public MaintenanceDelegation1 setParametersSubsetDefinition(Max3000Binary parametersSubsetDefinition) {
		this.parametersSubsetDefinition = parametersSubsetDefinition;
		return this;
	}

	public List<Max5000Binary> getCertificate() {
		return certificate == null ? certificate = new ArrayList<>() : certificate;
	}

	public MaintenanceDelegation1 setCertificate(List<Max5000Binary> certificate) {
		this.certificate = Objects.requireNonNull(certificate);
		return this;
	}

	public List<MaintenanceIdentificationAssociation1> getPOIIdentificationAssociation() {
		return pOIIdentificationAssociation == null ? pOIIdentificationAssociation = new ArrayList<>() : pOIIdentificationAssociation;
	}

	public MaintenanceDelegation1 setPOIIdentificationAssociation(List<com.tools20022.repository.msg.MaintenanceIdentificationAssociation1> pOIIdentificationAssociation) {
		this.pOIIdentificationAssociation = Objects.requireNonNull(pOIIdentificationAssociation);
		return this;
	}

	public List<KEKIdentifier2> getSymmetricKey() {
		return symmetricKey == null ? symmetricKey = new ArrayList<>() : symmetricKey;
	}

	public MaintenanceDelegation1 setSymmetricKey(List<com.tools20022.repository.msg.KEKIdentifier2> symmetricKey) {
		this.symmetricKey = Objects.requireNonNull(symmetricKey);
		return this;
	}

	public Optional<TerminalManagementDataSet14> getParameterDataSet() {
		return parameterDataSet == null ? Optional.empty() : Optional.of(parameterDataSet);
	}

	public MaintenanceDelegation1 setParameterDataSet(com.tools20022.repository.msg.TerminalManagementDataSet14 parameterDataSet) {
		this.parameterDataSet = parameterDataSet;
		return this;
	}
}