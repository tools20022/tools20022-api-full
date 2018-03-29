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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.other.ExtensionContents1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Technical component that contains the validated extension information. This
 * technical envelope allows to segregate the extension information from any
 * other information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ExtensionEnvelope1#mmExtensionContents
 * ExtensionEnvelope1.mmExtensionContents}</li>
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
 * "ExtensionEnvelope1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Technical component that contains the validated extension information. This technical envelope allows to segregate the extension information from any other information."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ExtensionEnvelope1", propOrder = "extensionContents")
public class ExtensionEnvelope1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "XtnsnCnts", required = true)
	protected ExtensionContents1 extensionContents;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.other.ExtensionContents1
	 * ExtensionContents1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ExtensionEnvelope1
	 * ExtensionEnvelope1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtnsnCnts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtensionContents"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Technical element that specifies the extension."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ExtensionEnvelope1, ExtensionContents1> mmExtensionContents = new MMMessageAttribute<ExtensionEnvelope1, ExtensionContents1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ExtensionEnvelope1.mmObject();
			isDerived = false;
			xmlTag = "XtnsnCnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtensionContents";
			definition = "Technical element that specifies the extension.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ExtensionContents1.mmObject();
		}

		@Override
		public ExtensionContents1 getValue(ExtensionEnvelope1 obj) {
			return obj.getExtensionContents();
		}

		@Override
		public void setValue(ExtensionEnvelope1 obj, ExtensionContents1 value) {
			obj.setExtensionContents(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExtensionEnvelope1.mmExtensionContents);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtensionEnvelope1";
				definition = "Technical component that contains the validated extension information. This technical envelope allows to segregate the extension information from any other information.";
			}
		});
		return mmObject_lazy.get();
	}

	public ExtensionContents1 getExtensionContents() {
		return extensionContents;
	}

	public ExtensionEnvelope1 setExtensionContents(ExtensionContents1 extensionContents) {
		this.extensionContents = Objects.requireNonNull(extensionContents);
		return this;
	}
}