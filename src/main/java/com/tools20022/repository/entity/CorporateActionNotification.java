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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CorporateActionNotificationTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#mmRelatedServicing
 * CorporateActionNotification.mmRelatedServicing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#mmCorporateActionNotificationIdentification
 * CorporateActionNotification.mmCorporateActionNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#mmNotificationType
 * CorporateActionNotification.mmNotificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#mmCreationDateTime
 * CorporateActionNotification.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionEventNotification
 * CorporateActionServicing.mmCorporateActionEventNotification}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.NotificationIdentification5
 * NotificationIdentification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NotificationIdentification6
 * NotificationIdentification6}</li>
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
	protected CorporateActionServicing relatedServicing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionEventNotification
	 * CorporateActionServicing.mmCorporateActionEventNotification}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionNotification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionEventNotification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
		}
	};
	protected Max35Text corporateActionNotificationIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification1#mmIdentification
	 * NotificationIdentification1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification2#mmIdentification
	 * NotificationIdentification2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification3#mmIdentification
	 * NotificationIdentification3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification4#mmIdentification
	 * NotificationIdentification4.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification5#mmIdentification
	 * NotificationIdentification5.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification6#mmIdentification
	 * NotificationIdentification6.mmIdentification}</li>
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
	public static final MMBusinessAttribute mmCorporateActionNotificationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(NotificationIdentification1.mmIdentification, NotificationIdentification2.mmIdentification, NotificationIdentification3.mmIdentification, NotificationIdentification4.mmIdentification,
					NotificationIdentification5.mmIdentification, NotificationIdentification6.mmIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionNotification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionNotificationIdentification";
			definition = "Identifies the corporate action notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification.class.getMethod("getCorporateActionNotificationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionNotificationTypeCode notificationType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1#mmType
	 * CorporateActionPreliminaryAdviceType1.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification2#mmNotificationType
	 * CorporateActionNotification2.mmNotificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification3#mmNotificationType
	 * CorporateActionNotification3.mmNotificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType2#mmType
	 * CorporateActionPreliminaryAdviceType2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification4#mmNotificationType
	 * CorporateActionNotification4.mmNotificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification5#mmNotificationType
	 * CorporateActionNotification5.mmNotificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification6#mmNotificationType
	 * CorporateActionNotification6.mmNotificationType}</li>
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
	public static final MMBusinessAttribute mmNotificationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPreliminaryAdviceType1.mmType, CorporateActionNotification2.mmNotificationType, CorporateActionNotification3.mmNotificationType, CorporateActionPreliminaryAdviceType2.mmType,
					CorporateActionNotification4.mmNotificationType, CorporateActionNotification5.mmNotificationType, CorporateActionNotification6.mmNotificationType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionNotification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotificationType";
			definition = "Specifies the type of notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionNotificationTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification.class.getMethod("getNotificationType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification1#mmCreationDateTime
	 * NotificationIdentification1.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification2#mmCreationDateTime
	 * NotificationIdentification2.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification3#mmCreationDateTime
	 * NotificationIdentification3.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification4#mmCreationDateTime
	 * NotificationIdentification4.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification5#mmCreationDateTime
	 * NotificationIdentification5.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationIdentification6#mmCreationDateTime
	 * NotificationIdentification6.mmCreationDateTime}</li>
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
	public static final MMBusinessAttribute mmCreationDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(NotificationIdentification1.mmCreationDateTime, NotificationIdentification2.mmCreationDateTime, NotificationIdentification3.mmCreationDateTime,
					NotificationIdentification4.mmCreationDateTime, NotificationIdentification5.mmCreationDateTime, NotificationIdentification6.mmCreationDateTime);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionNotification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the date and time when the notification was issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionNotification.class.getMethod("getCreationDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotification";
				definition = "The process of notifying of an upcoming corporate action. It provides corporate action details including the different options.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionEventNotification);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionNotification.mmRelatedServicing, com.tools20022.repository.entity.CorporateActionNotification.mmCorporateActionNotificationIdentification,
						com.tools20022.repository.entity.CorporateActionNotification.mmNotificationType, com.tools20022.repository.entity.CorporateActionNotification.mmCreationDateTime);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionCancellation1.mmObject(), CorporateActionCancellation2.mmObject(), NotificationIdentification1.mmObject(), NotificationIdentification2.mmObject(),
						CorporateActionPreliminaryAdviceType1.mmObject(), CorporateActionNotification2.mmObject(), CorporateActionNotification3.mmObject(), CorporateActionNotification1.mmObject(),
						CorporateActionNotificationAdvice1.mmObject(), CorporateActionCancellation3.mmObject(), CorporateActionPreliminaryAdviceType2.mmObject(), CorporateActionNotification4.mmObject(),
						CorporateActionCancellation4.mmObject(), CorporateActionNotification5.mmObject(), NotificationIdentification3.mmObject(), NotificationIdentification4.mmObject(), CorporateActionNotification6.mmObject(),
						NotificationIdentification5.mmObject(), NotificationIdentification6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionNotification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CorporateActionServicing> getRelatedServicing() {
		return relatedServicing == null ? Optional.empty() : Optional.of(relatedServicing);
	}

	public CorporateActionNotification setRelatedServicing(com.tools20022.repository.entity.CorporateActionServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
		return this;
	}

	public Max35Text getCorporateActionNotificationIdentification() {
		return corporateActionNotificationIdentification;
	}

	public CorporateActionNotification setCorporateActionNotificationIdentification(Max35Text corporateActionNotificationIdentification) {
		this.corporateActionNotificationIdentification = Objects.requireNonNull(corporateActionNotificationIdentification);
		return this;
	}

	public CorporateActionNotificationTypeCode getNotificationType() {
		return notificationType;
	}

	public CorporateActionNotification setNotificationType(CorporateActionNotificationTypeCode notificationType) {
		this.notificationType = Objects.requireNonNull(notificationType);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public CorporateActionNotification setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}
}