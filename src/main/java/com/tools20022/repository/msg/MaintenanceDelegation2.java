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
import com.tools20022.repository.codeset.Response2Code;
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmMaintenanceService
 * MaintenanceDelegation2.mmMaintenanceService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmResponse
 * MaintenanceDelegation2.mmResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmResponseReason
 * MaintenanceDelegation2.mmResponseReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmPOISubset
 * MaintenanceDelegation2.mmPOISubset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmParametersSubsetIdentification
 * MaintenanceDelegation2.mmParametersSubsetIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmParametersSubsetDefinition
 * MaintenanceDelegation2.mmParametersSubsetDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmDelegationProof
 * MaintenanceDelegation2.mmDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmProtectedDelegationProof
 * MaintenanceDelegation2.mmProtectedDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmPOIIdentificationAssociation
 * MaintenanceDelegation2.mmPOIIdentificationAssociation}</li>
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
 * "MaintenanceDelegation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information on the delegation of a maintenance action or maintenance function."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MaintenanceDelegation4
 * MaintenanceDelegation4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1
 * MaintenanceDelegation1}</li>
 * </ul>
 */
public class MaintenanceDelegation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<DataSetCategory6Code> maintenanceService;
	/**
	 * Maintenance service to be delegated.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2
	 * MaintenanceDelegation2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmMaintenanceService
	 * MaintenanceDelegation4.mmMaintenanceService}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmMaintenanceService
	 * MaintenanceDelegation1.mmMaintenanceService}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaintenanceService = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation2.mmObject();
			isDerived = false;
			xmlTag = "MntncSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceService";
			definition = "Maintenance service to be delegated.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation4.mmMaintenanceService);
			previousVersion_lazy = () -> MaintenanceDelegation1.mmMaintenanceService;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetCategory6Code.mmObject();
		}
	};
	protected Response2Code response;
	/**
	 * Response of the MTM to the delegation of the maintenance service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Response2Code
	 * Response2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2
	 * MaintenanceDelegation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Response"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Response of the MTM to the delegation of the maintenance service."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmResponse
	 * MaintenanceDelegation4.mmResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResponse = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation2.mmObject();
			isDerived = false;
			xmlTag = "Rspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Response of the MTM to the delegation of the maintenance service.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation4.mmResponse);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Response2Code.mmObject();
		}
	};
	protected Max35Text responseReason;
	/**
	 * Reason of the response of the MTM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2
	 * MaintenanceDelegation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason of the response of the MTM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmResponseReason
	 * MaintenanceDelegation4.mmResponseReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResponseReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation2.mmObject();
			isDerived = false;
			xmlTag = "RspnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseReason";
			definition = "Reason of the response of the MTM.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation4.mmResponseReason);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max35Text> pOISubset;
	/**
	 * Subset of the terminal estate for the delegated actions, for instance for
	 * pilot or key deactivation). The subset may be expressed as a list of POI
	 * or terminal estate subset identifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2
	 * MaintenanceDelegation2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmPOISubset
	 * MaintenanceDelegation4.mmPOISubset}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmPOISubset
	 * MaintenanceDelegation1.mmPOISubset}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOISubset = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation2.mmObject();
			isDerived = false;
			xmlTag = "POISubset";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POISubset";
			definition = "Subset of the terminal estate for the delegated actions, for instance for pilot or key deactivation). The subset may be expressed as a list of POI or terminal estate subset identifier.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation4.mmPOISubset);
			previousVersion_lazy = () -> MaintenanceDelegation1.mmPOISubset;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text parametersSubsetIdentification;
	/**
	 * Identification of the parameters subset assigned by the MTM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2
	 * MaintenanceDelegation2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmDelegationScopeIdentification
	 * MaintenanceDelegation4.mmDelegationScopeIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmParametersSubsetIdentification
	 * MaintenanceDelegation1.mmParametersSubsetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParametersSubsetIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation2.mmObject();
			isDerived = false;
			xmlTag = "ParamsSubsetId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParametersSubsetIdentification";
			definition = "Identification of the parameters subset assigned by the MTM.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation4.mmDelegationScopeIdentification);
			previousVersion_lazy = () -> MaintenanceDelegation1.mmParametersSubsetIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max3000Binary parametersSubsetDefinition;
	/**
	 * Definition of the subset of application parameters, for instance the
	 * range of application profiles, the RID (registered application provider
	 * identification).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2
	 * MaintenanceDelegation2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmDelegationScopeDefinition
	 * MaintenanceDelegation4.mmDelegationScopeDefinition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmParametersSubsetDefinition
	 * MaintenanceDelegation1.mmParametersSubsetDefinition}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParametersSubsetDefinition = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation2.mmObject();
			isDerived = false;
			xmlTag = "ParamsSubsetDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParametersSubsetDefinition";
			definition = "Definition of the subset of application parameters, for instance the range of application profiles, the RID (registered application provider identification).";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation4.mmDelegationScopeDefinition);
			previousVersion_lazy = () -> MaintenanceDelegation1.mmParametersSubsetDefinition;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}
	};
	protected Max5000Binary delegationProof;
	/**
	 * Proof of delegation to be verified by the POI, when performing the
	 * delegated actions.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2
	 * MaintenanceDelegation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proof of delegation to be verified by the POI, when performing the delegated actions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmDelegationProof
	 * MaintenanceDelegation4.mmDelegationProof}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDelegationProof = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation2.mmObject();
			isDerived = false;
			xmlTag = "DlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationProof";
			definition = "Proof of delegation to be verified by the POI, when performing the delegated actions.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation4.mmDelegationProof);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};
	protected ContentInformationType12 protectedDelegationProof;
	/**
	 * Protected proof of delegation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2
	 * MaintenanceDelegation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdDlgtnProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedDelegationProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protected proof of delegation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmProtectedDelegationProof
	 * MaintenanceDelegation4.mmProtectedDelegationProof}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedDelegationProof = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegation2.mmObject();
			isDerived = false;
			xmlTag = "PrtctdDlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedDelegationProof";
			definition = "Protected proof of delegation.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation4.mmProtectedDelegationProof);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType12.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.MaintenanceIdentificationAssociation1> pOIIdentificationAssociation;
	/**
	 * Association of the TM identifier and the MTM identifier of a POI.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceIdentificationAssociation1
	 * MaintenanceIdentificationAssociation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2
	 * MaintenanceDelegation2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmPOIIdentificationAssociation
	 * MaintenanceDelegation4.mmPOIIdentificationAssociation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation1#mmPOIIdentificationAssociation
	 * MaintenanceDelegation1.mmPOIIdentificationAssociation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOIIdentificationAssociation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegation2.mmObject();
			isDerived = false;
			xmlTag = "POIIdAssoctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentificationAssociation";
			definition = "Association of the TM identifier and the MTM identifier of a POI.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation4.mmPOIIdentificationAssociation);
			previousVersion_lazy = () -> MaintenanceDelegation1.mmPOIIdentificationAssociation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MaintenanceIdentificationAssociation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MaintenanceDelegation2.mmMaintenanceService, MaintenanceDelegation2.mmResponse, MaintenanceDelegation2.mmResponseReason, MaintenanceDelegation2.mmPOISubset,
						MaintenanceDelegation2.mmParametersSubsetIdentification, MaintenanceDelegation2.mmParametersSubsetDefinition, MaintenanceDelegation2.mmDelegationProof, MaintenanceDelegation2.mmProtectedDelegationProof,
						MaintenanceDelegation2.mmPOIIdentificationAssociation);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegation2";
				definition = "Information on the delegation of a maintenance action or maintenance function.";
				nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation4.mmObject());
				previousVersion_lazy = () -> MaintenanceDelegation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<DataSetCategory6Code> getMaintenanceService() {
		return maintenanceService;
	}

	public void setMaintenanceService(List<DataSetCategory6Code> maintenanceService) {
		this.maintenanceService = maintenanceService;
	}

	public Response2Code getResponse() {
		return response;
	}

	public void setResponse(Response2Code response) {
		this.response = response;
	}

	public Max35Text getResponseReason() {
		return responseReason;
	}

	public void setResponseReason(Max35Text responseReason) {
		this.responseReason = responseReason;
	}

	public List<Max35Text> getPOISubset() {
		return pOISubset;
	}

	public void setPOISubset(List<Max35Text> pOISubset) {
		this.pOISubset = pOISubset;
	}

	public Max35Text getParametersSubsetIdentification() {
		return parametersSubsetIdentification;
	}

	public void setParametersSubsetIdentification(Max35Text parametersSubsetIdentification) {
		this.parametersSubsetIdentification = parametersSubsetIdentification;
	}

	public Max3000Binary getParametersSubsetDefinition() {
		return parametersSubsetDefinition;
	}

	public void setParametersSubsetDefinition(Max3000Binary parametersSubsetDefinition) {
		this.parametersSubsetDefinition = parametersSubsetDefinition;
	}

	public Max5000Binary getDelegationProof() {
		return delegationProof;
	}

	public void setDelegationProof(Max5000Binary delegationProof) {
		this.delegationProof = delegationProof;
	}

	public ContentInformationType12 getProtectedDelegationProof() {
		return protectedDelegationProof;
	}

	public void setProtectedDelegationProof(com.tools20022.repository.msg.ContentInformationType12 protectedDelegationProof) {
		this.protectedDelegationProof = protectedDelegationProof;
	}

	public List<MaintenanceIdentificationAssociation1> getPOIIdentificationAssociation() {
		return pOIIdentificationAssociation;
	}

	public void setPOIIdentificationAssociation(List<com.tools20022.repository.msg.MaintenanceIdentificationAssociation1> pOIIdentificationAssociation) {
		this.pOIIdentificationAssociation = pOIIdentificationAssociation;
	}
}