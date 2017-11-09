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
import com.tools20022.repository.codeset.DataSetCategory11Code;
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max10KBinary;
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
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
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmDelegationType
 * MaintenanceDelegation5.mmDelegationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmMaintenanceService
 * MaintenanceDelegation5.mmMaintenanceService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmPartialDelegation
 * MaintenanceDelegation5.mmPartialDelegation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmPOISubset
 * MaintenanceDelegation5.mmPOISubset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmDelegatedAction
 * MaintenanceDelegation5.mmDelegatedAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmDelegationScopeIdentification
 * MaintenanceDelegation5.mmDelegationScopeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmDelegationScopeDefinition
 * MaintenanceDelegation5.mmDelegationScopeDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmCertificate
 * MaintenanceDelegation5.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmPOIIdentificationAssociation
 * MaintenanceDelegation5.mmPOIIdentificationAssociation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmSymmetricKey
 * MaintenanceDelegation5.mmSymmetricKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5#mmParameterDataSet
 * MaintenanceDelegation5.mmParameterDataSet}</li>
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
 * "MaintenanceDelegation5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information on the delegation of a maintenance action or maintenance function."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3
 * MaintenanceDelegation3}</li>
 * </ul>
 */
public class MaintenanceDelegation5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TerminalManagementAction3Code delegationType;
	/**
	 * Type of delegation action.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmDelegationType
	 * MaintenanceDelegation3.mmDelegationType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDelegationType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "DlgtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationType";
			definition = "Type of delegation action.";
			previousVersion_lazy = () -> MaintenanceDelegation3.mmDelegationType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}
	};
	protected List<DataSetCategory11Code> maintenanceService;
	/**
	 * Maintenance service to be delegated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmMaintenanceService
	 * MaintenanceDelegation3.mmMaintenanceService}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaintenanceService = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "MntncSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceService";
			definition = "Maintenance service to be delegated.";
			previousVersion_lazy = () -> MaintenanceDelegation3.mmMaintenanceService;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetCategory11Code.mmObject();
		}
	};
	protected TrueFalseIndicator partialDelegation;
	/**
	 * Flag to indicate that the delegated maintenance must be performed on a
	 * subset of the terminal estate.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmPartialDelegation
	 * MaintenanceDelegation3.mmPartialDelegation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartialDelegation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "PrtlDlgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDelegation";
			definition = "Flag to indicate that the delegated maintenance must be performed on a subset of the terminal estate. ";
			previousVersion_lazy = () -> MaintenanceDelegation3.mmPartialDelegation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmPOISubset
	 * MaintenanceDelegation3.mmPOISubset}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOISubset = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "POISubset";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POISubset";
			definition = "Subset of the terminal estate for the delegated actions, for instance for pilot or key deactivation). The subset may be expressed as a list of POI or terminal estate subset identifier.";
			previousVersion_lazy = () -> MaintenanceDelegation3.mmPOISubset;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected MaintenanceDelegateAction3 delegatedAction;
	/**
	 * Information for the MTM to build or include delegated actions in the
	 * management plan of the POI.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegateAction3
	 * MaintenanceDelegateAction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmDelegatedAction
	 * MaintenanceDelegation3.mmDelegatedAction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDelegatedAction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "DlgtdActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegatedAction";
			definition = "Information for the MTM to build or include delegated actions in the management plan of the POI.";
			previousVersion_lazy = () -> MaintenanceDelegation3.mmDelegatedAction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegateAction3.mmObject();
		}
	};
	protected Max35Text delegationScopeIdentification;
	/**
	 * Identification of the delegation scope assigned by the MTM.
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
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
	 * "Identification of the delegation scope assigned by the MTM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmDelegationScopeIdentification
	 * MaintenanceDelegation3.mmDelegationScopeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDelegationScopeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "DlgtnScpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationScopeIdentification";
			definition = "Identification of the delegation scope assigned by the MTM.";
			previousVersion_lazy = () -> MaintenanceDelegation3.mmDelegationScopeIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max3000Binary delegationScopeDefinition;
	/**
	 * Definition of the delegation scope, for instance inside the payment
	 * application parameters the range of application profiles, the RID
	 * (registered application provider identification).
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmDelegationScopeDefinition
	 * MaintenanceDelegation3.mmDelegationScopeDefinition}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDelegationScopeDefinition = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "DlgtnScpDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationScopeDefinition";
			definition = "Definition of the delegation scope, for instance inside the payment application parameters the range of application profiles, the RID (registered application provider identification).";
			previousVersion_lazy = () -> MaintenanceDelegation3.mmDelegationScopeDefinition;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}
	};
	protected List<Max10KBinary> certificate;
	/**
	 * Certificate path of the terminal manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10KBinary Max10KBinary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmCertificate
	 * MaintenanceDelegation3.mmCertificate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Certificate path of the terminal manager.";
			previousVersion_lazy = () -> MaintenanceDelegation3.mmCertificate;
			minOccurs = 0;
			simpleType_lazy = () -> Max10KBinary.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmPOIIdentificationAssociation
	 * MaintenanceDelegation3.mmPOIIdentificationAssociation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPOIIdentificationAssociation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "POIIdAssoctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentificationAssociation";
			definition = "Association of the TM identifier and the MTM identifier of a POI.";
			previousVersion_lazy = () -> MaintenanceDelegation3.mmPOIIdentificationAssociation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MaintenanceIdentificationAssociation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.KEKIdentifier5> symmetricKey;
	/**
	 * Identification of the key to manage or to download.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEKIdentifier5
	 * KEKIdentifier5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmSymmetricKey
	 * MaintenanceDelegation3.mmSymmetricKey}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSymmetricKey = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "SmmtrcKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SymmetricKey";
			definition = "Identification of the key to manage or to download.";
			previousVersion_lazy = () -> MaintenanceDelegation3.mmSymmetricKey;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.KEKIdentifier5.mmObject();
		}
	};
	protected TerminalManagementDataSet20 parameterDataSet;
	/**
	 * Configuration parameters of the terminal manager to be sent by the MTM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TerminalManagementDataSet20
	 * TerminalManagementDataSet20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation5
	 * MaintenanceDelegation5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation3#mmParameterDataSet
	 * MaintenanceDelegation3.mmParameterDataSet}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParameterDataSet = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MaintenanceDelegation5.mmObject();
			isDerived = false;
			xmlTag = "ParamDataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParameterDataSet";
			definition = "Configuration parameters of the terminal manager to be sent by the MTM.";
			previousVersion_lazy = () -> MaintenanceDelegation3.mmParameterDataSet;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TerminalManagementDataSet20.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MaintenanceDelegation5.mmDelegationType, MaintenanceDelegation5.mmMaintenanceService, MaintenanceDelegation5.mmPartialDelegation, MaintenanceDelegation5.mmPOISubset,
						MaintenanceDelegation5.mmDelegatedAction, MaintenanceDelegation5.mmDelegationScopeIdentification, MaintenanceDelegation5.mmDelegationScopeDefinition, MaintenanceDelegation5.mmCertificate,
						MaintenanceDelegation5.mmPOIIdentificationAssociation, MaintenanceDelegation5.mmSymmetricKey, MaintenanceDelegation5.mmParameterDataSet);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegation5";
				definition = "Information on the delegation of a maintenance action or maintenance function.";
				previousVersion_lazy = () -> MaintenanceDelegation3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction3Code getDelegationType() {
		return delegationType;
	}

	public void setDelegationType(TerminalManagementAction3Code delegationType) {
		this.delegationType = delegationType;
	}

	public List<DataSetCategory11Code> getMaintenanceService() {
		return maintenanceService;
	}

	public void setMaintenanceService(List<DataSetCategory11Code> maintenanceService) {
		this.maintenanceService = maintenanceService;
	}

	public TrueFalseIndicator getPartialDelegation() {
		return partialDelegation;
	}

	public void setPartialDelegation(TrueFalseIndicator partialDelegation) {
		this.partialDelegation = partialDelegation;
	}

	public List<Max35Text> getPOISubset() {
		return pOISubset;
	}

	public void setPOISubset(List<Max35Text> pOISubset) {
		this.pOISubset = pOISubset;
	}

	public MaintenanceDelegateAction3 getDelegatedAction() {
		return delegatedAction;
	}

	public void setDelegatedAction(com.tools20022.repository.msg.MaintenanceDelegateAction3 delegatedAction) {
		this.delegatedAction = delegatedAction;
	}

	public Max35Text getDelegationScopeIdentification() {
		return delegationScopeIdentification;
	}

	public void setDelegationScopeIdentification(Max35Text delegationScopeIdentification) {
		this.delegationScopeIdentification = delegationScopeIdentification;
	}

	public Max3000Binary getDelegationScopeDefinition() {
		return delegationScopeDefinition;
	}

	public void setDelegationScopeDefinition(Max3000Binary delegationScopeDefinition) {
		this.delegationScopeDefinition = delegationScopeDefinition;
	}

	public List<Max10KBinary> getCertificate() {
		return certificate;
	}

	public void setCertificate(List<Max10KBinary> certificate) {
		this.certificate = certificate;
	}

	public List<MaintenanceIdentificationAssociation1> getPOIIdentificationAssociation() {
		return pOIIdentificationAssociation;
	}

	public void setPOIIdentificationAssociation(List<com.tools20022.repository.msg.MaintenanceIdentificationAssociation1> pOIIdentificationAssociation) {
		this.pOIIdentificationAssociation = pOIIdentificationAssociation;
	}

	public List<KEKIdentifier5> getSymmetricKey() {
		return symmetricKey;
	}

	public void setSymmetricKey(List<com.tools20022.repository.msg.KEKIdentifier5> symmetricKey) {
		this.symmetricKey = symmetricKey;
	}

	public TerminalManagementDataSet20 getParameterDataSet() {
		return parameterDataSet;
	}

	public void setParameterDataSet(com.tools20022.repository.msg.TerminalManagementDataSet20 parameterDataSet) {
		this.parameterDataSet = parameterDataSet;
	}
}