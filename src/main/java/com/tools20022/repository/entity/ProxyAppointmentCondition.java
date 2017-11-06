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
import com.tools20022.repository.choice.Proxy1Choice;
import com.tools20022.repository.choice.Proxy2Choice;
import com.tools20022.repository.codeset.ProxyTypeCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.msg.ProxyAppointmentInformation1;
import com.tools20022.repository.msg.ProxyAppointmentInformation2;
import com.tools20022.repository.msg.ProxyAppointmentInformation3;
import com.tools20022.repository.msg.ProxyParameters;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Conditions that must be met to appoint a proxy.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProxyAppointmentCondition"
 * src="doc-files/ProxyAppointmentCondition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmNotificationAddress
 * ProxyAppointmentCondition.mmNotificationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmMeeting
 * ProxyAppointmentCondition.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmRegistrationMethod
 * ProxyAppointmentCondition.mmRegistrationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition#mmAllowedProxyType
 * ProxyAppointmentCondition.mmAllowedProxyType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedProxyAppointment
 * ContactPoint.mmRelatedProxyAppointment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Meeting#mmProxyAppointmentConditions
 * Meeting.mmProxyAppointmentConditions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ProxyParameters#mmAuthorisedProxy
 * ProxyParameters.mmAuthorisedProxy}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Proxy1Choice#mmProxy
 * Proxy1Choice.mmProxy}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Proxy2Choice#mmProxy
 * Proxy2Choice.mmProxy}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProxyParameters
 * ProxyParameters}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1
 * ProxyAppointmentInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2
 * ProxyAppointmentInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Proxy1Choice Proxy1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Proxy2Choice Proxy2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3
 * ProxyAppointmentInformation3}</li>
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
 * "ProxyAppointmentCondition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Conditions that must be met to appoint a proxy."</li>
 * </ul>
 */
public class ProxyAppointmentCondition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ContactPoint notificationAddress;
	/**
	 * Address where the information on the proxy should be sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedProxyAppointment
	 * ContactPoint.mmRelatedProxyAppointment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address where the information on the proxy should be sent."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNotificationAddress = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProxyAppointmentCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotificationAddress";
			definition = "Address where the information on the proxy should be sent.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedProxyAppointment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected Meeting meeting;
	/**
	 * Specifies the meeting to which the proxy appointment conditions aplly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmProxyAppointmentConditions
	 * Meeting.mmProxyAppointmentConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the meeting to which the proxy appointment conditions aplly."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeeting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ProxyAppointmentCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Specifies the meeting to which the proxy appointment conditions aplly.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmProxyAppointmentConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};
	protected Max350Text registrationMethod;
	/**
	 * Indicates how to register a proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1#mmRegistrationMethod
	 * ProxyAppointmentInformation1.mmRegistrationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation2#mmRegistrationMethod
	 * ProxyAppointmentInformation2.mmRegistrationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation3#mmRegistrationMethod
	 * ProxyAppointmentInformation3.mmRegistrationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates how to register a proxy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRegistrationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyAppointmentInformation1.mmRegistrationMethod, com.tools20022.repository.msg.ProxyAppointmentInformation2.mmRegistrationMethod,
					com.tools20022.repository.msg.ProxyAppointmentInformation3.mmRegistrationMethod);
			elementContext_lazy = () -> ProxyAppointmentCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegistrationMethod";
			definition = "Indicates how to register a proxy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ProxyTypeCode allowedProxyType;
	/**
	 * Specifies who can be assigned as a proxy.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyTypeCode
	 * ProxyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProxyAppointmentCondition
	 * ProxyAppointmentCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowedProxyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies who can be assigned as a proxy."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAllowedProxyType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> ProxyAppointmentCondition.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllowedProxyType";
			definition = "Specifies who can be assigned as a proxy.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProxyTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ProxyAppointmentCondition";
				definition = "Conditions that must be met to appoint a proxy.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.mmRelatedProxyAppointment, com.tools20022.repository.entity.Meeting.mmProxyAppointmentConditions);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ProxyParameters.mmAuthorisedProxy, com.tools20022.repository.choice.Proxy1Choice.mmProxy, com.tools20022.repository.choice.Proxy2Choice.mmProxy);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProxyAppointmentCondition.mmNotificationAddress, com.tools20022.repository.entity.ProxyAppointmentCondition.mmMeeting,
						com.tools20022.repository.entity.ProxyAppointmentCondition.mmRegistrationMethod, com.tools20022.repository.entity.ProxyAppointmentCondition.mmAllowedProxyType);
				derivationComponent_lazy = () -> Arrays.asList(ProxyParameters.mmObject(), ProxyAppointmentInformation1.mmObject(), ProxyAppointmentInformation2.mmObject(), Proxy1Choice.mmObject(), Proxy2Choice.mmObject(),
						ProxyAppointmentInformation3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ContactPoint getNotificationAddress() {
		return notificationAddress;
	}

	public void setNotificationAddress(com.tools20022.repository.entity.ContactPoint notificationAddress) {
		this.notificationAddress = notificationAddress;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(com.tools20022.repository.entity.Meeting meeting) {
		this.meeting = meeting;
	}

	public Max350Text getRegistrationMethod() {
		return registrationMethod;
	}

	public void setRegistrationMethod(Max350Text registrationMethod) {
		this.registrationMethod = registrationMethod;
	}

	public ProxyTypeCode getAllowedProxyType() {
		return allowedProxyType;
	}

	public void setAllowedProxyType(ProxyTypeCode allowedProxyType) {
		this.allowedProxyType = allowedProxyType;
	}
}