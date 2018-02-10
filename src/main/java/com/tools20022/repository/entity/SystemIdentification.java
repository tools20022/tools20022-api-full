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

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.MarketInfrastructureIdentification1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters that identify a system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystemIdentification" src="doc-files/SystemIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentificationForSystem
 * SystemIdentification.mmIdentificationForSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmModel
 * SystemIdentification.mmModel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmSerialNumber
 * SystemIdentification.mmSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmApprovalNumber
 * SystemIdentification.mmApprovalNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmSystemVersion
 * SystemIdentification.mmSystemVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmSystemName
 * SystemIdentification.mmSystemName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentification
 * SystemIdentification.mmIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSystemIdentification
 * GenericIdentification.mmRelatedSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
 * System.mmSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemName#mmSystemIdentification
 * SystemName.mmSystemIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarketInfrastructureIdentification1Choice#mmCode
 * MarketInfrastructureIdentification1Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarketInfrastructureIdentification1Choice#mmProprietary
 * MarketInfrastructureIdentification1Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarketInfrastructureIdentification1Choice
 * MarketInfrastructureIdentification1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AutomatedTellerMachine3
 * AutomatedTellerMachine3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4
 * AutomatedTellerMachine4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AutomatedTellerMachine10
 * AutomatedTellerMachine10}</li>
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
 * "SystemIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters that identify a system."</li>
 * </ul>
 */
public class SystemIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected System identificationForSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
	 * System.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.System System}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine3#mmIdentification
	 * AutomatedTellerMachine3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmIdentification
	 * AutomatedTellerMachine4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine10#mmIdentification
	 * AutomatedTellerMachine10.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationForSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System which is identified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentificationForSystem = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AutomatedTellerMachine3.mmIdentification, AutomatedTellerMachine4.mmIdentification, AutomatedTellerMachine10.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentificationForSystem";
			definition = "System which is identified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.System.mmSystemIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.System.mmObject();
		}
	};
	protected Max35Text model;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent1#mmModel
	 * PointOfInteractionComponent1.mmModel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#mmModel
	 * PointOfInteractionComponent2.mmModel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Model"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a model for a given manufacturer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmModel = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PointOfInteractionComponent1.mmModel, PointOfInteractionComponent2.mmModel);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Model";
			definition = "Identification of a model for a given manufacturer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SystemIdentification.class.getMethod("getModel", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text serialNumber;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent1#mmSerialNumber
	 * PointOfInteractionComponent1.mmSerialNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#mmSerialNumber
	 * PointOfInteractionComponent2.mmSerialNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentIdentification1#mmSerialNumber
	 * PointOfInteractionComponentIdentification1.mmSerialNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Serial number of a component."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSerialNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PointOfInteractionComponent1.mmSerialNumber, PointOfInteractionComponent2.mmSerialNumber, PointOfInteractionComponentIdentification1.mmSerialNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SerialNumber";
			definition = "Serial number of a component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SystemIdentification.class.getMethod("getSerialNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max70Text approvalNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent1#mmApprovalNumber
	 * PointOfInteractionComponent1.mmApprovalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#mmApprovalNumber
	 * PointOfInteractionComponent2.mmApprovalNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovalNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique approval number for a component, delivered by a certification body."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmApprovalNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PointOfInteractionComponent1.mmApprovalNumber, PointOfInteractionComponent2.mmApprovalNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApprovalNumber";
			definition = "Unique approval number for a component, delivered by a certification body.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SystemIdentification.class.getMethod("getApprovalNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text systemVersion;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#mmVersionNumber
	 * PointOfInteractionComponent2.mmVersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus1#mmVersionNumber
	 * PointOfInteractionComponentStatus1.mmVersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus2#mmVersionNumber
	 * PointOfInteractionComponentStatus2.mmVersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus3#mmVersionNumber
	 * PointOfInteractionComponentStatus3.mmVersionNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Version of the system, eg, \"4.0.1\" to indicate version 4.0.1."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSystemVersion = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PointOfInteractionComponent2.mmVersionNumber, PointOfInteractionComponentStatus1.mmVersionNumber, PointOfInteractionComponentStatus2.mmVersionNumber,
					PointOfInteractionComponentStatus3.mmVersionNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemVersion";
			definition = "Version of the system, eg, \"4.0.1\" to indicate version 4.0.1.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SystemIdentification.class.getMethod("getSystemVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SystemName> systemName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemName#mmSystemIdentification
	 * SystemName.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemName
	 * SystemName}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine3#mmSequenceNumber
	 * AutomatedTellerMachine3.mmSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmSequenceNumber
	 * AutomatedTellerMachine4.mmSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine10#mmSequenceNumber
	 * AutomatedTellerMachine10.mmSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name by which a system is known."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystemName = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AutomatedTellerMachine3.mmSequenceNumber, AutomatedTellerMachine4.mmSequenceNumber, AutomatedTellerMachine10.mmSequenceNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemName";
			definition = "Name by which a system is known.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemName.mmSystemIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemName.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.GenericIdentification> identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmRelatedSystemIdentification
	 * GenericIdentification.mmRelatedSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification
	 * GenericIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan1#mmPOIIdentification
	 * ManagementPlan1.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan1#mmTerminalManagerIdentification
	 * ManagementPlan1.mmTerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan2#mmPOIIdentification
	 * ManagementPlan2.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan2#mmTerminalManagerIdentification
	 * ManagementPlan2.mmTerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#mmPOIIdentification
	 * CardPaymentTransaction17.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan3#mmPOIIdentification
	 * ManagementPlan3.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan3#mmTerminalManagerIdentification
	 * ManagementPlan3.mmTerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction21#mmPOIIdentification
	 * CardPaymentTransaction21.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction33#mmPOIIdentification
	 * CardPaymentTransaction33.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan4#mmPOIIdentification
	 * ManagementPlan4.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan4#mmTerminalManagerIdentification
	 * ManagementPlan4.mmTerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction50#mmPOIIdentification
	 * CardPaymentTransaction50.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37#mmPOIIdentification
	 * CardPaymentTransaction37.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan5#mmPOIIdentification
	 * ManagementPlan5.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan5#mmTerminalManagerIdentification
	 * ManagementPlan5.mmTerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#mmPOIIdentification
	 * CardPaymentTransaction52.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction65#mmPOIIdentification
	 * CardPaymentTransaction65.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan6#mmPOIIdentification
	 * ManagementPlan6.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan6#mmTerminalManagerIdentification
	 * ManagementPlan6.mmTerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73#mmPOIIdentification
	 * CardPaymentTransaction73.mmPOIIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ManagementPlan1.mmPOIIdentification, ManagementPlan1.mmTerminalManagerIdentification, ManagementPlan2.mmPOIIdentification, ManagementPlan2.mmTerminalManagerIdentification,
					CardPaymentTransaction17.mmPOIIdentification, ManagementPlan3.mmPOIIdentification, ManagementPlan3.mmTerminalManagerIdentification, CardPaymentTransaction21.mmPOIIdentification,
					CardPaymentTransaction33.mmPOIIdentification, ManagementPlan4.mmPOIIdentification, ManagementPlan4.mmTerminalManagerIdentification, CardPaymentTransaction50.mmPOIIdentification,
					CardPaymentTransaction37.mmPOIIdentification, ManagementPlan5.mmPOIIdentification, ManagementPlan5.mmTerminalManagerIdentification, CardPaymentTransaction52.mmPOIIdentification,
					CardPaymentTransaction65.mmPOIIdentification, ManagementPlan6.mmPOIIdentification, ManagementPlan6.mmTerminalManagerIdentification, CardPaymentTransaction73.mmPOIIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of a system.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmRelatedSystemIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemIdentification";
				definition = "Parameters that identify a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.mmRelatedSystemIdentification, com.tools20022.repository.entity.System.mmSystemIdentification,
						com.tools20022.repository.entity.SystemName.mmSystemIdentification);
				derivationElement_lazy = () -> Arrays.asList(MarketInfrastructureIdentification1Choice.mmCode, MarketInfrastructureIdentification1Choice.mmProprietary);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemIdentification.mmIdentificationForSystem, com.tools20022.repository.entity.SystemIdentification.mmModel,
						com.tools20022.repository.entity.SystemIdentification.mmSerialNumber, com.tools20022.repository.entity.SystemIdentification.mmApprovalNumber, com.tools20022.repository.entity.SystemIdentification.mmSystemVersion,
						com.tools20022.repository.entity.SystemIdentification.mmSystemName, com.tools20022.repository.entity.SystemIdentification.mmIdentification);
				derivationComponent_lazy = () -> Arrays.asList(MarketInfrastructureIdentification1Choice.mmObject(), AutomatedTellerMachine3.mmObject(), AutomatedTellerMachine4.mmObject(), AutomatedTellerMachine10.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SystemIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<System> getIdentificationForSystem() {
		return identificationForSystem == null ? Optional.empty() : Optional.of(identificationForSystem);
	}

	public SystemIdentification setIdentificationForSystem(com.tools20022.repository.entity.System identificationForSystem) {
		this.identificationForSystem = identificationForSystem;
		return this;
	}

	public Max35Text getModel() {
		return model;
	}

	public SystemIdentification setModel(Max35Text model) {
		this.model = Objects.requireNonNull(model);
		return this;
	}

	public Max35Text getSerialNumber() {
		return serialNumber;
	}

	public SystemIdentification setSerialNumber(Max35Text serialNumber) {
		this.serialNumber = Objects.requireNonNull(serialNumber);
		return this;
	}

	public Max70Text getApprovalNumber() {
		return approvalNumber;
	}

	public SystemIdentification setApprovalNumber(Max70Text approvalNumber) {
		this.approvalNumber = Objects.requireNonNull(approvalNumber);
		return this;
	}

	public Max35Text getSystemVersion() {
		return systemVersion;
	}

	public SystemIdentification setSystemVersion(Max35Text systemVersion) {
		this.systemVersion = Objects.requireNonNull(systemVersion);
		return this;
	}

	public List<SystemName> getSystemName() {
		return systemName == null ? systemName = new ArrayList<>() : systemName;
	}

	public SystemIdentification setSystemName(List<com.tools20022.repository.entity.SystemName> systemName) {
		this.systemName = Objects.requireNonNull(systemName);
		return this;
	}

	public List<GenericIdentification> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public SystemIdentification setIdentification(List<com.tools20022.repository.entity.GenericIdentification> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}
}