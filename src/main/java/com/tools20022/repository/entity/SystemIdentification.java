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
import com.tools20022.repository.choice.MarketInfrastructureIdentification1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.msg.AutomatedTellerMachine10;
import com.tools20022.repository.msg.AutomatedTellerMachine3;
import com.tools20022.repository.msg.AutomatedTellerMachine4;
import java.util.Arrays;
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
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#IdentificationForSystem
 * SystemIdentification.IdentificationForSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemIdentification#Model
 * SystemIdentification.Model}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#SerialNumber
 * SystemIdentification.SerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#ApprovalNumber
 * SystemIdentification.ApprovalNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#SystemVersion
 * SystemIdentification.SystemVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#SystemName
 * SystemIdentification.SystemName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#Identification
 * SystemIdentification.Identification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedSystemIdentification
 * GenericIdentification.RelatedSystemIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#SystemIdentification
 * System.SystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemName#SystemIdentification
 * SystemName.SystemIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarketInfrastructureIdentification1Choice#Code
 * MarketInfrastructureIdentification1Choice.Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarketInfrastructureIdentification1Choice#Proprietary
 * MarketInfrastructureIdentification1Choice.Proprietary}</li>
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
	/**
	 * System which is identified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.System#SystemIdentification
	 * System.SystemIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine3#Identification
	 * AutomatedTellerMachine3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#Identification
	 * AutomatedTellerMachine4.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine10#Identification
	 * AutomatedTellerMachine10.Identification}</li>
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
	public static final MMBusinessAssociationEnd IdentificationForSystem = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AutomatedTellerMachine3.Identification, com.tools20022.repository.msg.AutomatedTellerMachine4.Identification,
					com.tools20022.repository.msg.AutomatedTellerMachine10.Identification);
			elementContext_lazy = () -> SystemIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentificationForSystem";
			definition = "System which is identified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> System.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.System.SystemIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of a model for a given manufacturer.
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent1#Model
	 * PointOfInteractionComponent1.Model}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#Model
	 * PointOfInteractionComponent2.Model}</li>
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
	public static final MMBusinessAttribute Model = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionComponent1.Model, com.tools20022.repository.msg.PointOfInteractionComponent2.Model);
			elementContext_lazy = () -> SystemIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Model";
			definition = "Identification of a model for a given manufacturer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Serial number of a component.
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent1#SerialNumber
	 * PointOfInteractionComponent1.SerialNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#SerialNumber
	 * PointOfInteractionComponent2.SerialNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentIdentification1#SerialNumber
	 * PointOfInteractionComponentIdentification1.SerialNumber}</li>
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
	public static final MMBusinessAttribute SerialNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionComponent1.SerialNumber, com.tools20022.repository.msg.PointOfInteractionComponent2.SerialNumber,
					com.tools20022.repository.msg.PointOfInteractionComponentIdentification1.SerialNumber);
			elementContext_lazy = () -> SystemIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SerialNumber";
			definition = "Serial number of a component.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Unique approval number for a component, delivered by a certification
	 * body.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent1#ApprovalNumber
	 * PointOfInteractionComponent1.ApprovalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#ApprovalNumber
	 * PointOfInteractionComponent2.ApprovalNumber}</li>
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
	public static final MMBusinessAttribute ApprovalNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionComponent1.ApprovalNumber, com.tools20022.repository.msg.PointOfInteractionComponent2.ApprovalNumber);
			elementContext_lazy = () -> SystemIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApprovalNumber";
			definition = "Unique approval number for a component, delivered by a certification body.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Version of the system, eg, "4.0.1" to indicate version 4.0.1.
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponent2#VersionNumber
	 * PointOfInteractionComponent2.VersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus1#VersionNumber
	 * PointOfInteractionComponentStatus1.VersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus2#VersionNumber
	 * PointOfInteractionComponentStatus2.VersionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentStatus3#VersionNumber
	 * PointOfInteractionComponentStatus3.VersionNumber}</li>
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
	 * name} = "SystemVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Version of the system, eg, \"4.0.1\" to indicate version 4.0.1."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SystemVersion = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionComponent2.VersionNumber, com.tools20022.repository.msg.PointOfInteractionComponentStatus1.VersionNumber,
					com.tools20022.repository.msg.PointOfInteractionComponentStatus2.VersionNumber, com.tools20022.repository.msg.PointOfInteractionComponentStatus3.VersionNumber);
			elementContext_lazy = () -> SystemIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemVersion";
			definition = "Version of the system, eg, \"4.0.1\" to indicate version 4.0.1.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Name by which a system is known.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemName#SystemIdentification
	 * SystemName.SystemIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine3#SequenceNumber
	 * AutomatedTellerMachine3.SequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#SequenceNumber
	 * AutomatedTellerMachine4.SequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine10#SequenceNumber
	 * AutomatedTellerMachine10.SequenceNumber}</li>
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
	public static final MMBusinessAssociationEnd SystemName = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AutomatedTellerMachine3.SequenceNumber, com.tools20022.repository.msg.AutomatedTellerMachine4.SequenceNumber,
					com.tools20022.repository.msg.AutomatedTellerMachine10.SequenceNumber);
			elementContext_lazy = () -> SystemIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SystemName";
			definition = "Name by which a system is known.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SystemName.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemName.SystemIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification of a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#RelatedSystemIdentification
	 * GenericIdentification.RelatedSystemIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan1#POIIdentification
	 * ManagementPlan1.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan1#TerminalManagerIdentification
	 * ManagementPlan1.TerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan2#POIIdentification
	 * ManagementPlan2.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan2#TerminalManagerIdentification
	 * ManagementPlan2.TerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction17#POIIdentification
	 * CardPaymentTransaction17.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan3#POIIdentification
	 * ManagementPlan3.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan3#TerminalManagerIdentification
	 * ManagementPlan3.TerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction21#POIIdentification
	 * CardPaymentTransaction21.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction33#POIIdentification
	 * CardPaymentTransaction33.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan4#POIIdentification
	 * ManagementPlan4.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan4#TerminalManagerIdentification
	 * ManagementPlan4.TerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction50#POIIdentification
	 * CardPaymentTransaction50.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction37#POIIdentification
	 * CardPaymentTransaction37.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan5#POIIdentification
	 * ManagementPlan5.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan5#TerminalManagerIdentification
	 * ManagementPlan5.TerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction52#POIIdentification
	 * CardPaymentTransaction52.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction65#POIIdentification
	 * CardPaymentTransaction65.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan6#POIIdentification
	 * ManagementPlan6.POIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ManagementPlan6#TerminalManagerIdentification
	 * ManagementPlan6.TerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction73#POIIdentification
	 * CardPaymentTransaction73.POIIdentification}</li>
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
	public static final MMBusinessAssociationEnd Identification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ManagementPlan1.POIIdentification, com.tools20022.repository.msg.ManagementPlan1.TerminalManagerIdentification,
					com.tools20022.repository.msg.ManagementPlan2.POIIdentification, com.tools20022.repository.msg.ManagementPlan2.TerminalManagerIdentification, com.tools20022.repository.msg.CardPaymentTransaction17.POIIdentification,
					com.tools20022.repository.msg.ManagementPlan3.POIIdentification, com.tools20022.repository.msg.ManagementPlan3.TerminalManagerIdentification, com.tools20022.repository.msg.CardPaymentTransaction21.POIIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction33.POIIdentification, com.tools20022.repository.msg.ManagementPlan4.POIIdentification, com.tools20022.repository.msg.ManagementPlan4.TerminalManagerIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction50.POIIdentification, com.tools20022.repository.msg.CardPaymentTransaction37.POIIdentification, com.tools20022.repository.msg.ManagementPlan5.POIIdentification,
					com.tools20022.repository.msg.ManagementPlan5.TerminalManagerIdentification, com.tools20022.repository.msg.CardPaymentTransaction52.POIIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction65.POIIdentification, com.tools20022.repository.msg.ManagementPlan6.POIIdentification, com.tools20022.repository.msg.ManagementPlan6.TerminalManagerIdentification,
					com.tools20022.repository.msg.CardPaymentTransaction73.POIIdentification);
			elementContext_lazy = () -> SystemIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Identification of a system.";
			minOccurs = 0;
			type_lazy = () -> GenericIdentification.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.GenericIdentification.RelatedSystemIdentification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemIdentification";
				definition = "Parameters that identify a system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.GenericIdentification.RelatedSystemIdentification, com.tools20022.repository.entity.System.SystemIdentification,
						com.tools20022.repository.entity.SystemName.SystemIdentification);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarketInfrastructureIdentification1Choice.Code, com.tools20022.repository.choice.MarketInfrastructureIdentification1Choice.Proprietary);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SystemIdentification.IdentificationForSystem, com.tools20022.repository.entity.SystemIdentification.Model,
						com.tools20022.repository.entity.SystemIdentification.SerialNumber, com.tools20022.repository.entity.SystemIdentification.ApprovalNumber, com.tools20022.repository.entity.SystemIdentification.SystemVersion,
						com.tools20022.repository.entity.SystemIdentification.SystemName, com.tools20022.repository.entity.SystemIdentification.Identification);
				derivationComponent_lazy = () -> Arrays.asList(MarketInfrastructureIdentification1Choice.mmObject(), AutomatedTellerMachine3.mmObject(), AutomatedTellerMachine4.mmObject(), AutomatedTellerMachine10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}