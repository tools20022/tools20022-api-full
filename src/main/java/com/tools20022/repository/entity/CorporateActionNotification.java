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
import com.tools20022.repository.codeset.CorporateActionNotificationTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The process of notifying of an upcoming corporate action. It provides
 * corporate action details including the different options.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionNotification"
 * src="doc-files/CorporateActionNotification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#RelatedServicing
 * CorporateActionNotification.RelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#CorporateActionNotificationIdentification
 * CorporateActionNotification.CorporateActionNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#NotificationType
 * CorporateActionNotification.NotificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#CreationDateTime
 * CorporateActionNotification.CreationDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionEventNotification
 * CorporateActionServicing.CorporateActionEventNotification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionCancellation1
 * CorporateActionCancellation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionCancellation2
 * CorporateActionCancellation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationIdentification1
 * NotificationIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationIdentification2
 * NotificationIdentification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1
 * CorporateActionPreliminaryAdviceType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNotification2
 * CorporateActionNotification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNotification3
 * CorporateActionNotification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNotification1
 * CorporateActionNotification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationAdvice1
 * CorporateActionNotificationAdvice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionCancellation3
 * CorporateActionCancellation3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType2
 * CorporateActionPreliminaryAdviceType2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNotification4
 * CorporateActionNotification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionCancellation4
 * CorporateActionCancellation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNotification5
 * CorporateActionNotification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationIdentification3
 * NotificationIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationIdentification4
 * NotificationIdentification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionNotification6
 * CorporateActionNotification6}</li>
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
 * "CorporateActionNotification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The process of notifying of an upcoming corporate action. It provides corporate action details including the different options."
 * </li>
 * </ul>
 */
public class CorporateActionNotification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Process which groups the activities related to corporate action
	 * servicing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#CorporateActionEventNotification
	 * CorporateActionServicing.CorporateActionEventNotification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification
	 * CorporateActionNotification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to corporate action servicing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedServicing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionNotification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionServicing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.CorporateActionEventNotification;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies the corporate action notification.
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
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification1#Identification
	 * NotificationIdentification1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification2#Identification
	 * NotificationIdentification2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification3#Identification
	 * NotificationIdentification3.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification4#Identification
	 * NotificationIdentification4.Identification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification
	 * CorporateActionNotification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the corporate action notification."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CorporateActionNotificationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NotificationIdentification1.Identification, com.tools20022.repository.msg.NotificationIdentification2.Identification,
					com.tools20022.repository.msg.NotificationIdentification3.Identification, com.tools20022.repository.msg.NotificationIdentification4.Identification);
			elementContext_lazy = () -> CorporateActionNotification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionNotificationIdentification";
			definition = "Identifies the corporate action notification.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Specifies the type of notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionNotificationTypeCode
	 * CorporateActionNotificationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1#Type
	 * CorporateActionPreliminaryAdviceType1.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification2#NotificationType
	 * CorporateActionNotification2.NotificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3#NotificationType
	 * CorporateActionNotification3.NotificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType2#Type
	 * CorporateActionPreliminaryAdviceType2.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#NotificationType
	 * CorporateActionNotification4.NotificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#NotificationType
	 * CorporateActionNotification5.NotificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6#NotificationType
	 * CorporateActionNotification6.NotificationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification
	 * CorporateActionNotification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of notification."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute NotificationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1.Type, com.tools20022.repository.msg.CorporateActionNotification2.NotificationType,
					com.tools20022.repository.msg.CorporateActionNotification3.NotificationType, com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType2.Type,
					com.tools20022.repository.msg.CorporateActionNotification4.NotificationType, com.tools20022.repository.msg.CorporateActionNotification5.NotificationType,
					com.tools20022.repository.msg.CorporateActionNotification6.NotificationType);
			elementContext_lazy = () -> CorporateActionNotification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotificationType";
			definition = "Specifies the type of notification.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the date and time when the notification was issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification1#CreationDateTime
	 * NotificationIdentification1.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification2#CreationDateTime
	 * NotificationIdentification2.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification3#CreationDateTime
	 * NotificationIdentification3.CreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification4#CreationDateTime
	 * NotificationIdentification4.CreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification
	 * CorporateActionNotification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date and time when the notification was issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CreationDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NotificationIdentification1.CreationDateTime, com.tools20022.repository.msg.NotificationIdentification2.CreationDateTime,
					com.tools20022.repository.msg.NotificationIdentification3.CreationDateTime, com.tools20022.repository.msg.NotificationIdentification4.CreationDateTime);
			elementContext_lazy = () -> CorporateActionNotification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the date and time when the notification was issued.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotification";
				definition = "The process of notifying of an upcoming corporate action. It provides corporate action details including the different options.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionServicing.CorporateActionEventNotification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionNotification.RelatedServicing, com.tools20022.repository.entity.CorporateActionNotification.CorporateActionNotificationIdentification,
						com.tools20022.repository.entity.CorporateActionNotification.NotificationType, com.tools20022.repository.entity.CorporateActionNotification.CreationDateTime);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionCancellation1.mmObject(), CorporateActionCancellation2.mmObject(), NotificationIdentification1.mmObject(), NotificationIdentification2.mmObject(),
						CorporateActionPreliminaryAdviceType1.mmObject(), CorporateActionNotification2.mmObject(), CorporateActionNotification3.mmObject(), CorporateActionNotification1.mmObject(),
						CorporateActionNotificationAdvice1.mmObject(), CorporateActionCancellation3.mmObject(), CorporateActionPreliminaryAdviceType2.mmObject(), CorporateActionNotification4.mmObject(),
						CorporateActionCancellation4.mmObject(), CorporateActionNotification5.mmObject(), NotificationIdentification3.mmObject(), NotificationIdentification4.mmObject(), CorporateActionNotification6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}