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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Min5Max16Binary;
import com.tools20022.repository.datatype.Number;
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
 * Identification of a key encryption key (KEK), using previously distributed
 * symmetric key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2#mmKeyIdentification
 * KEKIdentifier2.mmKeyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.KEKIdentifier2#mmKeyVersion
 * KEKIdentifier2.mmKeyVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2#mmSequenceNumber
 * KEKIdentifier2.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2#mmDerivationIdentification
 * KEKIdentifier2.mmDerivationIdentification}</li>
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
 * "KEKIdentifier2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a key encryption key (KEK), using previously distributed symmetric key."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.KEKIdentifier3 KEKIdentifier3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.KEKIdentifier5 KEKIdentifier5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.KEKIdentifier1
 * KEKIdentifier1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "KEKIdentifier2", propOrder = {"keyIdentification", "keyVersion", "sequenceNumber", "derivationIdentification"})
public class KEKIdentifier2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "KeyId", required = true)
	protected Max140Text keyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2 KEKIdentifier2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier3#mmIdentification
	 * KEKIdentifier3.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmKeyIdentification
	 * KEKIdentifier5.mmKeyIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier1#mmKeyIdentification
	 * KEKIdentifier1.mmKeyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KEKIdentifier2, Max140Text> mmKeyIdentification = new MMMessageAttribute<KEKIdentifier2, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KEKIdentifier2.mmObject();
			isDerived = false;
			xmlTag = "KeyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyIdentification";
			definition = "Identification of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(KEKIdentifier3.mmIdentification, KEKIdentifier5.mmKeyIdentification);
			previousVersion_lazy = () -> KEKIdentifier1.mmKeyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(KEKIdentifier2 obj) {
			return obj.getKeyIdentification();
		}

		@Override
		public void setValue(KEKIdentifier2 obj, Max140Text value) {
			obj.setKeyIdentification(value);
		}
	};
	@XmlElement(name = "KeyVrsn", required = true)
	protected Max140Text keyVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2 KEKIdentifier2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.KEKIdentifier3#mmVersion
	 * KEKIdentifier3.mmVersion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmKeyVersion
	 * KEKIdentifier5.mmKeyVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier1#mmKeyVersion
	 * KEKIdentifier1.mmKeyVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KEKIdentifier2, Max140Text> mmKeyVersion = new MMMessageAttribute<KEKIdentifier2, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KEKIdentifier2.mmObject();
			isDerived = false;
			xmlTag = "KeyVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyVersion";
			definition = "Version of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(KEKIdentifier3.mmVersion, KEKIdentifier5.mmKeyVersion);
			previousVersion_lazy = () -> KEKIdentifier1.mmKeyVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(KEKIdentifier2 obj) {
			return obj.getKeyVersion();
		}

		@Override
		public void setValue(KEKIdentifier2 obj, Max140Text value) {
			obj.setKeyVersion(value);
		}
	};
	@XmlElement(name = "SeqNb")
	protected Number sequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2 KEKIdentifier2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of usages of the cryptographic key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmSequenceNumber
	 * KEKIdentifier5.mmSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KEKIdentifier2, Optional<Number>> mmSequenceNumber = new MMMessageAttribute<KEKIdentifier2, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KEKIdentifier2.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Number of usages of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(KEKIdentifier5.mmSequenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(KEKIdentifier2 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(KEKIdentifier2 obj, Optional<Number> value) {
			obj.setSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "DerivtnId")
	protected Min5Max16Binary derivationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Min5Max16Binary
	 * Min5Max16Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2 KEKIdentifier2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivtnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification used for derivation of a unique key from a master key provided for the data protection."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmDerivationIdentification
	 * KEKIdentifier5.mmDerivationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier1#mmDerivationIdentification
	 * KEKIdentifier1.mmDerivationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KEKIdentifier2, Optional<Min5Max16Binary>> mmDerivationIdentification = new MMMessageAttribute<KEKIdentifier2, Optional<Min5Max16Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KEKIdentifier2.mmObject();
			isDerived = false;
			xmlTag = "DerivtnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivationIdentification";
			definition = "Identification used for derivation of a unique key from a master key provided for the data protection.";
			nextVersions_lazy = () -> Arrays.asList(KEKIdentifier5.mmDerivationIdentification);
			previousVersion_lazy = () -> KEKIdentifier1.mmDerivationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min5Max16Binary.mmObject();
		}

		@Override
		public Optional<Min5Max16Binary> getValue(KEKIdentifier2 obj) {
			return obj.getDerivationIdentification();
		}

		@Override
		public void setValue(KEKIdentifier2 obj, Optional<Min5Max16Binary> value) {
			obj.setDerivationIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.KEKIdentifier2.mmKeyIdentification, com.tools20022.repository.msg.KEKIdentifier2.mmKeyVersion,
						com.tools20022.repository.msg.KEKIdentifier2.mmSequenceNumber, com.tools20022.repository.msg.KEKIdentifier2.mmDerivationIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "KEKIdentifier2";
				definition = "Identification of a key encryption key (KEK), using previously distributed symmetric key.";
				nextVersions_lazy = () -> Arrays.asList(KEKIdentifier3.mmObject(), KEKIdentifier5.mmObject());
				previousVersion_lazy = () -> KEKIdentifier1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getKeyIdentification() {
		return keyIdentification;
	}

	public KEKIdentifier2 setKeyIdentification(Max140Text keyIdentification) {
		this.keyIdentification = Objects.requireNonNull(keyIdentification);
		return this;
	}

	public Max140Text getKeyVersion() {
		return keyVersion;
	}

	public KEKIdentifier2 setKeyVersion(Max140Text keyVersion) {
		this.keyVersion = Objects.requireNonNull(keyVersion);
		return this;
	}

	public Optional<Number> getSequenceNumber() {
		return sequenceNumber == null ? Optional.empty() : Optional.of(sequenceNumber);
	}

	public KEKIdentifier2 setSequenceNumber(Number sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public Optional<Min5Max16Binary> getDerivationIdentification() {
		return derivationIdentification == null ? Optional.empty() : Optional.of(derivationIdentification);
	}

	public KEKIdentifier2 setDerivationIdentification(Min5Max16Binary derivationIdentification) {
		this.derivationIdentification = derivationIdentification;
		return this;
	}
}