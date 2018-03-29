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
import com.tools20022.repository.datatype.Max100AlphaNumericUnderscoreText;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the parameters for an Isabel reporting file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelFile4#mmFormat
 * IsabelFile4.mmFormat}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelFile4#mmName
 * IsabelFile4.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelFile4#mmMIMEType
 * IsabelFile4.mmMIMEType}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelFile4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the parameters for an Isabel reporting file."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelFile4", propOrder = {"format", "name", "mIMEType"})
public class IsabelFile4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Frmt", required = true)
	protected Max16Text format;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelFile4 IsabelFile4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Format"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format of the file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelFile4, Max16Text> mmFormat = new MMMessageAttribute<IsabelFile4, Max16Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelFile4.mmObject();
			isDerived = false;
			xmlTag = "Frmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Format";
			definition = "Format of the file.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(IsabelFile4 obj) {
			return obj.getFormat();
		}

		@Override
		public void setValue(IsabelFile4 obj, Max16Text value) {
			obj.setFormat(value);
		}
	};
	@XmlElement(name = "Nm")
	protected Max100AlphaNumericUnderscoreText name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max100AlphaNumericUnderscoreText
	 * Max100AlphaNumericUnderscoreText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelFile4 IsabelFile4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the mime file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelFile4, Optional<Max100AlphaNumericUnderscoreText>> mmName = new MMMessageAttribute<IsabelFile4, Optional<Max100AlphaNumericUnderscoreText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelFile4.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the mime file.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max100AlphaNumericUnderscoreText.mmObject();
		}

		@Override
		public Optional<Max100AlphaNumericUnderscoreText> getValue(IsabelFile4 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(IsabelFile4 obj, Optional<Max100AlphaNumericUnderscoreText> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "MIMETp")
	protected Max256Text mIMEType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelFile4 IsabelFile4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MIMETp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MIMEType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the mime file."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelFile4, Optional<Max256Text>> mmMIMEType = new MMMessageAttribute<IsabelFile4, Optional<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelFile4.mmObject();
			isDerived = false;
			xmlTag = "MIMETp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MIMEType";
			definition = "Type of the mime file.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(IsabelFile4 obj) {
			return obj.getMIMEType();
		}

		@Override
		public void setValue(IsabelFile4 obj, Optional<Max256Text> value) {
			obj.setMIMEType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelFile4.mmFormat, com.tools20022.repository.msg.IsabelFile4.mmName, com.tools20022.repository.msg.IsabelFile4.mmMIMEType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelFile4";
				definition = "Specifies the parameters for an Isabel reporting file.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max16Text getFormat() {
		return format;
	}

	public IsabelFile4 setFormat(Max16Text format) {
		this.format = Objects.requireNonNull(format);
		return this;
	}

	public Optional<Max100AlphaNumericUnderscoreText> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public IsabelFile4 setName(Max100AlphaNumericUnderscoreText name) {
		this.name = name;
		return this;
	}

	public Optional<Max256Text> getMIMEType() {
		return mIMEType == null ? Optional.empty() : Optional.of(mIMEType);
	}

	public IsabelFile4 setMIMEType(Max256Text mIMEType) {
		this.mIMEType = mIMEType;
		return this;
	}
}