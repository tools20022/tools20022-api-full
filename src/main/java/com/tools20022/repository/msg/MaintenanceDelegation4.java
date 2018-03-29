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
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType12;
import com.tools20022.repository.msg.MaintenanceIdentificationAssociation1;
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
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmMaintenanceService
 * MaintenanceDelegation4.mmMaintenanceService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmResponse
 * MaintenanceDelegation4.mmResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmResponseReason
 * MaintenanceDelegation4.mmResponseReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmDelegationType
 * MaintenanceDelegation4.mmDelegationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmPOISubset
 * MaintenanceDelegation4.mmPOISubset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmDelegationScopeIdentification
 * MaintenanceDelegation4.mmDelegationScopeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmDelegationScopeDefinition
 * MaintenanceDelegation4.mmDelegationScopeDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmDelegationProof
 * MaintenanceDelegation4.mmDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmProtectedDelegationProof
 * MaintenanceDelegation4.mmProtectedDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4#mmPOIIdentificationAssociation
 * MaintenanceDelegation4.mmPOIIdentificationAssociation}</li>
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
 * "MaintenanceDelegation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information on the delegation of a maintenance action or maintenance function."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MaintenanceDelegation6
 * MaintenanceDelegation6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2
 * MaintenanceDelegation2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MaintenanceDelegation4", propOrder = {"maintenanceService", "response", "responseReason", "delegationType", "pOISubset", "delegationScopeIdentification", "delegationScopeDefinition", "delegationProof",
		"protectedDelegationProof", "pOIIdentificationAssociation"})
public class MaintenanceDelegation4 {

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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4
	 * MaintenanceDelegation4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmMaintenanceService
	 * MaintenanceDelegation6.mmMaintenanceService}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmMaintenanceService
	 * MaintenanceDelegation2.mmMaintenanceService}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation4, List<DataSetCategory6Code>> mmMaintenanceService = new MMMessageAttribute<MaintenanceDelegation4, List<DataSetCategory6Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation4.mmObject();
			isDerived = false;
			xmlTag = "MntncSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceService";
			definition = "Maintenance service to be delegated.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation6.mmMaintenanceService);
			previousVersion_lazy = () -> MaintenanceDelegation2.mmMaintenanceService;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetCategory6Code.mmObject();
		}

		@Override
		public List<DataSetCategory6Code> getValue(MaintenanceDelegation4 obj) {
			return obj.getMaintenanceService();
		}

		@Override
		public void setValue(MaintenanceDelegation4 obj, List<DataSetCategory6Code> value) {
			obj.setMaintenanceService(value);
		}
	};
	@XmlElement(name = "Rspn", required = true)
	protected Response2Code response;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4
	 * MaintenanceDelegation4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmResponse
	 * MaintenanceDelegation6.mmResponse}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmResponse
	 * MaintenanceDelegation2.mmResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation4, Response2Code> mmResponse = new MMMessageAttribute<MaintenanceDelegation4, Response2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation4.mmObject();
			isDerived = false;
			xmlTag = "Rspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Response of the MTM to the delegation of the maintenance service.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation6.mmResponse);
			previousVersion_lazy = () -> MaintenanceDelegation2.mmResponse;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Response2Code.mmObject();
		}

		@Override
		public Response2Code getValue(MaintenanceDelegation4 obj) {
			return obj.getResponse();
		}

		@Override
		public void setValue(MaintenanceDelegation4 obj, Response2Code value) {
			obj.setResponse(value);
		}
	};
	@XmlElement(name = "RspnRsn")
	protected Max35Text responseReason;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4
	 * MaintenanceDelegation4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmResponseReason
	 * MaintenanceDelegation6.mmResponseReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmResponseReason
	 * MaintenanceDelegation2.mmResponseReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation4, Optional<Max35Text>> mmResponseReason = new MMMessageAttribute<MaintenanceDelegation4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation4.mmObject();
			isDerived = false;
			xmlTag = "RspnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseReason";
			definition = "Reason of the response of the MTM.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation6.mmResponseReason);
			previousVersion_lazy = () -> MaintenanceDelegation2.mmResponseReason;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MaintenanceDelegation4 obj) {
			return obj.getResponseReason();
		}

		@Override
		public void setValue(MaintenanceDelegation4 obj, Optional<Max35Text> value) {
			obj.setResponseReason(value.orElse(null));
		}
	};
	@XmlElement(name = "DlgtnTp", required = true)
	protected TerminalManagementAction3Code delegationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4
	 * MaintenanceDelegation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of delegation action."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmDelegationType
	 * MaintenanceDelegation6.mmDelegationType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation4, TerminalManagementAction3Code> mmDelegationType = new MMMessageAttribute<MaintenanceDelegation4, TerminalManagementAction3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation4.mmObject();
			isDerived = false;
			xmlTag = "DlgtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationType";
			definition = "Type of delegation action.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation6.mmDelegationType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}

		@Override
		public TerminalManagementAction3Code getValue(MaintenanceDelegation4 obj) {
			return obj.getDelegationType();
		}

		@Override
		public void setValue(MaintenanceDelegation4 obj, TerminalManagementAction3Code value) {
			obj.setDelegationType(value);
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4
	 * MaintenanceDelegation4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmPOISubset
	 * MaintenanceDelegation6.mmPOISubset}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmPOISubset
	 * MaintenanceDelegation2.mmPOISubset}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation4, List<Max35Text>> mmPOISubset = new MMMessageAttribute<MaintenanceDelegation4, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation4.mmObject();
			isDerived = false;
			xmlTag = "POISubset";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POISubset";
			definition = "Subset of the terminal estate for the delegated actions, for instance for pilot or key deactivation). The subset may be expressed as a list of POI or terminal estate subset identifier.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation6.mmPOISubset);
			previousVersion_lazy = () -> MaintenanceDelegation2.mmPOISubset;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MaintenanceDelegation4 obj) {
			return obj.getPOISubset();
		}

		@Override
		public void setValue(MaintenanceDelegation4 obj, List<Max35Text> value) {
			obj.setPOISubset(value);
		}
	};
	@XmlElement(name = "DlgtnScpId")
	protected Max35Text delegationScopeIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4
	 * MaintenanceDelegation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnScpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationScopeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the parameters subset assigned by the MTM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmDelegationScopeIdentification
	 * MaintenanceDelegation6.mmDelegationScopeIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmParametersSubsetIdentification
	 * MaintenanceDelegation2.mmParametersSubsetIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation4, Optional<Max35Text>> mmDelegationScopeIdentification = new MMMessageAttribute<MaintenanceDelegation4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation4.mmObject();
			isDerived = false;
			xmlTag = "DlgtnScpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationScopeIdentification";
			definition = "Identification of the parameters subset assigned by the MTM.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation6.mmDelegationScopeIdentification);
			previousVersion_lazy = () -> MaintenanceDelegation2.mmParametersSubsetIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MaintenanceDelegation4 obj) {
			return obj.getDelegationScopeIdentification();
		}

		@Override
		public void setValue(MaintenanceDelegation4 obj, Optional<Max35Text> value) {
			obj.setDelegationScopeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DlgtnScpDef")
	protected Max3000Binary delegationScopeDefinition;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4
	 * MaintenanceDelegation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnScpDef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationScopeDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Definition of the delegation scope, for instance inside the payment application parameters the range of application profiles, the RID (registered application provider identification)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmDelegationScopeDefinition
	 * MaintenanceDelegation6.mmDelegationScopeDefinition}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmParametersSubsetDefinition
	 * MaintenanceDelegation2.mmParametersSubsetDefinition}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation4, Optional<Max3000Binary>> mmDelegationScopeDefinition = new MMMessageAttribute<MaintenanceDelegation4, Optional<Max3000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation4.mmObject();
			isDerived = false;
			xmlTag = "DlgtnScpDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationScopeDefinition";
			definition = "Definition of the delegation scope, for instance inside the payment application parameters the range of application profiles, the RID (registered application provider identification).";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation6.mmDelegationScopeDefinition);
			previousVersion_lazy = () -> MaintenanceDelegation2.mmParametersSubsetDefinition;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}

		@Override
		public Optional<Max3000Binary> getValue(MaintenanceDelegation4 obj) {
			return obj.getDelegationScopeDefinition();
		}

		@Override
		public void setValue(MaintenanceDelegation4 obj, Optional<Max3000Binary> value) {
			obj.setDelegationScopeDefinition(value.orElse(null));
		}
	};
	@XmlElement(name = "DlgtnProof")
	protected Max5000Binary delegationProof;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4
	 * MaintenanceDelegation4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmDelegationProof
	 * MaintenanceDelegation6.mmDelegationProof}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmDelegationProof
	 * MaintenanceDelegation2.mmDelegationProof}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation4, Optional<Max5000Binary>> mmDelegationProof = new MMMessageAttribute<MaintenanceDelegation4, Optional<Max5000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation4.mmObject();
			isDerived = false;
			xmlTag = "DlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationProof";
			definition = "Proof of delegation to be verified by the POI, when performing the delegated actions.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation6.mmDelegationProof);
			previousVersion_lazy = () -> MaintenanceDelegation2.mmDelegationProof;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}

		@Override
		public Optional<Max5000Binary> getValue(MaintenanceDelegation4 obj) {
			return obj.getDelegationProof();
		}

		@Override
		public void setValue(MaintenanceDelegation4 obj, Optional<Max5000Binary> value) {
			obj.setDelegationProof(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctdDlgtnProof")
	protected ContentInformationType12 protectedDelegationProof;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4
	 * MaintenanceDelegation4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmProtectedDelegationProof
	 * MaintenanceDelegation6.mmProtectedDelegationProof}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmProtectedDelegationProof
	 * MaintenanceDelegation2.mmProtectedDelegationProof}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegation4, Optional<ContentInformationType12>> mmProtectedDelegationProof = new MMMessageAssociationEnd<MaintenanceDelegation4, Optional<ContentInformationType12>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation4.mmObject();
			isDerived = false;
			xmlTag = "PrtctdDlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedDelegationProof";
			definition = "Protected proof of delegation.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation6.mmProtectedDelegationProof);
			previousVersion_lazy = () -> MaintenanceDelegation2.mmProtectedDelegationProof;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType12.mmObject();
		}

		@Override
		public Optional<ContentInformationType12> getValue(MaintenanceDelegation4 obj) {
			return obj.getProtectedDelegationProof();
		}

		@Override
		public void setValue(MaintenanceDelegation4 obj, Optional<ContentInformationType12> value) {
			obj.setProtectedDelegationProof(value.orElse(null));
		}
	};
	@XmlElement(name = "POIIdAssoctn")
	protected List<MaintenanceIdentificationAssociation1> pOIIdentificationAssociation;
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation4
	 * MaintenanceDelegation4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmPOIIdentificationAssociation
	 * MaintenanceDelegation6.mmPOIIdentificationAssociation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation2#mmPOIIdentificationAssociation
	 * MaintenanceDelegation2.mmPOIIdentificationAssociation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegation4, List<MaintenanceIdentificationAssociation1>> mmPOIIdentificationAssociation = new MMMessageAssociationEnd<MaintenanceDelegation4, List<MaintenanceIdentificationAssociation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation4.mmObject();
			isDerived = false;
			xmlTag = "POIIdAssoctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentificationAssociation";
			definition = "Association of the TM identifier and the MTM identifier of a POI.";
			nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation6.mmPOIIdentificationAssociation);
			previousVersion_lazy = () -> MaintenanceDelegation2.mmPOIIdentificationAssociation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MaintenanceIdentificationAssociation1.mmObject();
		}

		@Override
		public List<MaintenanceIdentificationAssociation1> getValue(MaintenanceDelegation4 obj) {
			return obj.getPOIIdentificationAssociation();
		}

		@Override
		public void setValue(MaintenanceDelegation4 obj, List<MaintenanceIdentificationAssociation1> value) {
			obj.setPOIIdentificationAssociation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegation4.mmMaintenanceService, com.tools20022.repository.msg.MaintenanceDelegation4.mmResponse,
						com.tools20022.repository.msg.MaintenanceDelegation4.mmResponseReason, com.tools20022.repository.msg.MaintenanceDelegation4.mmDelegationType, com.tools20022.repository.msg.MaintenanceDelegation4.mmPOISubset,
						com.tools20022.repository.msg.MaintenanceDelegation4.mmDelegationScopeIdentification, com.tools20022.repository.msg.MaintenanceDelegation4.mmDelegationScopeDefinition,
						com.tools20022.repository.msg.MaintenanceDelegation4.mmDelegationProof, com.tools20022.repository.msg.MaintenanceDelegation4.mmProtectedDelegationProof,
						com.tools20022.repository.msg.MaintenanceDelegation4.mmPOIIdentificationAssociation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegation4";
				definition = "Information on the delegation of a maintenance action or maintenance function.";
				nextVersions_lazy = () -> Arrays.asList(MaintenanceDelegation6.mmObject());
				previousVersion_lazy = () -> MaintenanceDelegation2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<DataSetCategory6Code> getMaintenanceService() {
		return maintenanceService == null ? maintenanceService = new ArrayList<>() : maintenanceService;
	}

	public MaintenanceDelegation4 setMaintenanceService(List<DataSetCategory6Code> maintenanceService) {
		this.maintenanceService = Objects.requireNonNull(maintenanceService);
		return this;
	}

	public Response2Code getResponse() {
		return response;
	}

	public MaintenanceDelegation4 setResponse(Response2Code response) {
		this.response = Objects.requireNonNull(response);
		return this;
	}

	public Optional<Max35Text> getResponseReason() {
		return responseReason == null ? Optional.empty() : Optional.of(responseReason);
	}

	public MaintenanceDelegation4 setResponseReason(Max35Text responseReason) {
		this.responseReason = responseReason;
		return this;
	}

	public TerminalManagementAction3Code getDelegationType() {
		return delegationType;
	}

	public MaintenanceDelegation4 setDelegationType(TerminalManagementAction3Code delegationType) {
		this.delegationType = Objects.requireNonNull(delegationType);
		return this;
	}

	public List<Max35Text> getPOISubset() {
		return pOISubset == null ? pOISubset = new ArrayList<>() : pOISubset;
	}

	public MaintenanceDelegation4 setPOISubset(List<Max35Text> pOISubset) {
		this.pOISubset = Objects.requireNonNull(pOISubset);
		return this;
	}

	public Optional<Max35Text> getDelegationScopeIdentification() {
		return delegationScopeIdentification == null ? Optional.empty() : Optional.of(delegationScopeIdentification);
	}

	public MaintenanceDelegation4 setDelegationScopeIdentification(Max35Text delegationScopeIdentification) {
		this.delegationScopeIdentification = delegationScopeIdentification;
		return this;
	}

	public Optional<Max3000Binary> getDelegationScopeDefinition() {
		return delegationScopeDefinition == null ? Optional.empty() : Optional.of(delegationScopeDefinition);
	}

	public MaintenanceDelegation4 setDelegationScopeDefinition(Max3000Binary delegationScopeDefinition) {
		this.delegationScopeDefinition = delegationScopeDefinition;
		return this;
	}

	public Optional<Max5000Binary> getDelegationProof() {
		return delegationProof == null ? Optional.empty() : Optional.of(delegationProof);
	}

	public MaintenanceDelegation4 setDelegationProof(Max5000Binary delegationProof) {
		this.delegationProof = delegationProof;
		return this;
	}

	public Optional<ContentInformationType12> getProtectedDelegationProof() {
		return protectedDelegationProof == null ? Optional.empty() : Optional.of(protectedDelegationProof);
	}

	public MaintenanceDelegation4 setProtectedDelegationProof(ContentInformationType12 protectedDelegationProof) {
		this.protectedDelegationProof = protectedDelegationProof;
		return this;
	}

	public List<MaintenanceIdentificationAssociation1> getPOIIdentificationAssociation() {
		return pOIIdentificationAssociation == null ? pOIIdentificationAssociation = new ArrayList<>() : pOIIdentificationAssociation;
	}

	public MaintenanceDelegation4 setPOIIdentificationAssociation(List<MaintenanceIdentificationAssociation1> pOIIdentificationAssociation) {
		this.pOIIdentificationAssociation = Objects.requireNonNull(pOIIdentificationAssociation);
		return this;
	}
}