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
import com.tools20022.repository.choice.AutoExtend1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.UndertakingExtension;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Automatic extension information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AutoExtension1#mmPeriod
 * AutoExtension1.mmPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutoExtension1#mmFinalExpiryDate
 * AutoExtension1.mmFinalExpiryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutoExtension1#mmNonExtensionNotification
 * AutoExtension1.mmNonExtensionNotification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.UndertakingExtension
 * UndertakingExtension}</li>
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
 * "AutoExtension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Automatic extension information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AutoExtension1", propOrder = {"period", "finalExpiryDate", "nonExtensionNotification"})
public class AutoExtension1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AutoExtend1Choice period;
	/**
	 * Indicates that the undertaking is automatically extendable and the period
	 * of extension.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.AutoExtend1Choice
	 * AutoExtend1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmAutoExtensionPeriod
	 * UndertakingExtension.mmAutoExtensionPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutoExtension1 AutoExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the undertaking is automatically extendable and the period of extension."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> UndertakingExtension.mmAutoExtensionPeriod;
			componentContext_lazy = () -> AutoExtension1.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Indicates that the undertaking is automatically extendable and the period of extension.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AutoExtend1Choice.mmObject();
		}
	};
	protected ISODate finalExpiryDate;
	/**
	 * Final expiry date after which the undertaking will no longer be subject
	 * to automatic extension.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmAutoExtensionFinalExpiryDate
	 * UndertakingExtension.mmAutoExtensionFinalExpiryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutoExtension1 AutoExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlXpryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalExpiryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Final expiry date after which the undertaking will no longer be subject to automatic extension."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalExpiryDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> UndertakingExtension.mmAutoExtensionFinalExpiryDate;
			componentContext_lazy = () -> AutoExtension1.mmObject();
			isDerived = false;
			xmlTag = "FnlXpryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalExpiryDate";
			definition = "Final expiry date after which the undertaking will no longer be subject to automatic extension.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.NonExtension1> nonExtensionNotification;
	/**
	 * Details related to the notification of the end of the period for
	 * notification of non-extension of the expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NonExtension1
	 * NonExtension1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AutoExtension1 AutoExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonXtnsnNtfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonExtensionNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the notification of the end of the period for notification of non-extension of the expiry date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonExtensionNotification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AutoExtension1.mmObject();
			isDerived = false;
			xmlTag = "NonXtnsnNtfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonExtensionNotification";
			definition = "Details related to the notification of the end of the period for notification of non-extension of the expiry date.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NonExtension1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AutoExtension1.mmPeriod, AutoExtension1.mmFinalExpiryDate, AutoExtension1.mmNonExtensionNotification);
				trace_lazy = () -> UndertakingExtension.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AutoExtension1";
				definition = "Automatic extension information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Prd")
	public AutoExtend1Choice getPeriod() {
		return period;
	}

	public void setPeriod(AutoExtend1Choice period) {
		this.period = period;
	}

	@XmlElement(name = "FnlXpryDt")
	public ISODate getFinalExpiryDate() {
		return finalExpiryDate;
	}

	public void setFinalExpiryDate(ISODate finalExpiryDate) {
		this.finalExpiryDate = finalExpiryDate;
	}

	@XmlElement(name = "NonXtnsnNtfctn")
	public List<NonExtension1> getNonExtensionNotification() {
		return nonExtensionNotification;
	}

	public void setNonExtensionNotification(List<com.tools20022.repository.msg.NonExtension1> nonExtensionNotification) {
		this.nonExtensionNotification = nonExtensionNotification;
	}
}