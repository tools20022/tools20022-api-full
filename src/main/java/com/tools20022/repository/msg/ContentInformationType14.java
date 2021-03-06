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
import com.tools20022.repository.codeset.ContentType2Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SignedData4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General cryptographic message syntax (CMS) containing data. protected by a
 * digital signature.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType14#mmContentType
 * ContentInformationType14.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType14#mmSignedData
 * ContentInformationType14.mmSignedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ContentInformationType14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing data. protected by a digital signature."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
 * ContentInformationType12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContentInformationType14", propOrder = {"contentType", "signedData"})
public class ContentInformationType14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CnttTp", required = true)
	protected ContentType2Code contentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code
	 * ContentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType14
	 * ContentInformationType14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnttTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of data protection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmContentType
	 * ContentInformationType12.mmContentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ContentInformationType14, ContentType2Code> mmContentType = new MMMessageAttribute<ContentInformationType14, ContentType2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType14.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			previousVersion_lazy = () -> ContentInformationType12.mmContentType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType2Code.mmObject();
		}

		@Override
		public ContentType2Code getValue(ContentInformationType14 obj) {
			return obj.getContentType();
		}

		@Override
		public void setValue(ContentInformationType14 obj, ContentType2Code value) {
			obj.setContentType(value);
		}
	};
	@XmlElement(name = "SgndData", required = true)
	protected SignedData4 signedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedData4
	 * SignedData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType14
	 * ContentInformationType14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgndData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protected by a digital signatures."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmSignedData
	 * ContentInformationType12.mmSignedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContentInformationType14, SignedData4> mmSignedData = new MMMessageAssociationEnd<ContentInformationType14, SignedData4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType14.mmObject();
			isDerived = false;
			xmlTag = "SgndData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedData";
			definition = "Data protected by a digital signatures.";
			previousVersion_lazy = () -> ContentInformationType12.mmSignedData;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SignedData4.mmObject();
		}

		@Override
		public SignedData4 getValue(ContentInformationType14 obj) {
			return obj.getSignedData();
		}

		@Override
		public void setValue(ContentInformationType14 obj, SignedData4 value) {
			obj.setSignedData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType14.mmContentType, com.tools20022.repository.msg.ContentInformationType14.mmSignedData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType14";
				definition = "General cryptographic message syntax (CMS) containing data. protected by a digital signature.";
				previousVersion_lazy = () -> ContentInformationType12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ContentType2Code getContentType() {
		return contentType;
	}

	public ContentInformationType14 setContentType(ContentType2Code contentType) {
		this.contentType = Objects.requireNonNull(contentType);
		return this;
	}

	public SignedData4 getSignedData() {
		return signedData;
	}

	public ContentInformationType14 setSignedData(SignedData4 signedData) {
		this.signedData = Objects.requireNonNull(signedData);
		return this;
	}
}