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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType14;
import com.tools20022.repository.msg.TRRelatedData2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Element containing the signature.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ATMSignature2Choice#mmDigitalSignature
 * ATMSignature2Choice.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ATMSignature2Choice#mmTRRelatedData
 * ATMSignature2Choice.mmTRRelatedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMSignature2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Element containing the signature."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.ATMSignature1Choice
 * ATMSignature1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMSignature2Choice", propOrder = {"digitalSignature", "tRRelatedData"})
public class ATMSignature2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DgtlSgntr")
	protected ContentInformationType14 digitalSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType14
	 * ContentInformationType14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ATMSignature2Choice
	 * ATMSignature2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Digital signature of implicit data depending on the security scheme download procedure."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ATMSignature1Choice#mmDigitalSignature
	 * ATMSignature1Choice.mmDigitalSignature}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSignature2Choice, Optional<ContentInformationType14>> mmDigitalSignature = new MMMessageAssociationEnd<ATMSignature2Choice, Optional<ContentInformationType14>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ATMSignature2Choice.mmObject();
			isDerived = false;
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of implicit data depending on the security scheme download procedure.";
			previousVersion_lazy = () -> ATMSignature1Choice.mmDigitalSignature;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType14.mmObject();
		}

		@Override
		public Optional<ContentInformationType14> getValue(ATMSignature2Choice obj) {
			return obj.getDigitalSignature();
		}

		@Override
		public void setValue(ATMSignature2Choice obj, Optional<ContentInformationType14> value) {
			obj.setDigitalSignature(value.orElse(null));
		}
	};
	@XmlElement(name = "TRRltdData")
	protected TRRelatedData2 tRRelatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TRRelatedData2
	 * TRRelatedData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ATMSignature2Choice
	 * ATMSignature2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TRRltdData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TRRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The data block for a TR31 or TR34 block, where the block does not contain a key (for example the TR34 unbind which contains the signed authorization data)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ATMSignature1Choice#mmTRRelatedData
	 * ATMSignature1Choice.mmTRRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSignature2Choice, Optional<TRRelatedData2>> mmTRRelatedData = new MMMessageAssociationEnd<ATMSignature2Choice, Optional<TRRelatedData2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ATMSignature2Choice.mmObject();
			isDerived = false;
			xmlTag = "TRRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TRRelatedData";
			definition = "The data block for a TR31 or TR34 block, where the block does not contain a key (for example the TR34 unbind which contains the signed authorization data).";
			previousVersion_lazy = () -> ATMSignature1Choice.mmTRRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TRRelatedData2.mmObject();
		}

		@Override
		public Optional<TRRelatedData2> getValue(ATMSignature2Choice obj) {
			return obj.getTRRelatedData();
		}

		@Override
		public void setValue(ATMSignature2Choice obj, Optional<TRRelatedData2> value) {
			obj.setTRRelatedData(value.orElse(null));
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ATMSignature2Choice.mmDigitalSignature, com.tools20022.repository.choice.ATMSignature2Choice.mmTRRelatedData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSignature2Choice";
				definition = "Element containing the signature.";
				previousVersion_lazy = () -> ATMSignature1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ContentInformationType14> getDigitalSignature() {
		return digitalSignature == null ? Optional.empty() : Optional.of(digitalSignature);
	}

	public ATMSignature2Choice setDigitalSignature(ContentInformationType14 digitalSignature) {
		this.digitalSignature = digitalSignature;
		return this;
	}

	public Optional<TRRelatedData2> getTRRelatedData() {
		return tRRelatedData == null ? Optional.empty() : Optional.of(tRRelatedData);
	}

	public ATMSignature2Choice setTRRelatedData(TRRelatedData2 tRRelatedData) {
		this.tRRelatedData = tRRelatedData;
		return this;
	}
}