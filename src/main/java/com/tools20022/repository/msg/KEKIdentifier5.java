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
import com.tools20022.repository.codeset.CryptographicKeyType3Code;
import com.tools20022.repository.codeset.KeyUsage1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Min5Max16Binary;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmKeyIdentification
 * KEKIdentifier5.mmKeyIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmKeyVersion
 * KEKIdentifier5.mmKeyVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmSequenceNumber
 * KEKIdentifier5.mmSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmDerivationIdentification
 * KEKIdentifier5.mmDerivationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmType
 * KEKIdentifier5.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.KEKIdentifier5#mmFunction
 * KEKIdentifier5.mmFunction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "KEKIdentifier5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a key encryption key (KEK), using previously distributed symmetric key."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.KEKIdentifier2
 * KEKIdentifier2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "KEKIdentifier5", propOrder = {"keyIdentification", "keyVersion", "sequenceNumber", "derivationIdentification", "type", "function"})
public class KEKIdentifier5 {

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
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5 KEKIdentifier5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2#mmKeyIdentification
	 * KEKIdentifier2.mmKeyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KEKIdentifier5, Max140Text> mmKeyIdentification = new MMMessageAttribute<KEKIdentifier5, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KEKIdentifier5.mmObject();
			isDerived = false;
			xmlTag = "KeyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyIdentification";
			definition = "Identification of the cryptographic key.";
			previousVersion_lazy = () -> KEKIdentifier2.mmKeyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(KEKIdentifier5 obj) {
			return obj.getKeyIdentification();
		}

		@Override
		public void setValue(KEKIdentifier5 obj, Max140Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5 KEKIdentifier5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2#mmKeyVersion
	 * KEKIdentifier2.mmKeyVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KEKIdentifier5, Max140Text> mmKeyVersion = new MMMessageAttribute<KEKIdentifier5, Max140Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KEKIdentifier5.mmObject();
			isDerived = false;
			xmlTag = "KeyVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyVersion";
			definition = "Version of the cryptographic key.";
			previousVersion_lazy = () -> KEKIdentifier2.mmKeyVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Max140Text getValue(KEKIdentifier5 obj) {
			return obj.getKeyVersion();
		}

		@Override
		public void setValue(KEKIdentifier5 obj, Max140Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5 KEKIdentifier5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of usages of the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2#mmSequenceNumber
	 * KEKIdentifier2.mmSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KEKIdentifier5, Optional<Number>> mmSequenceNumber = new MMMessageAttribute<KEKIdentifier5, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KEKIdentifier5.mmObject();
			isDerived = false;
			xmlTag = "SeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumber";
			definition = "Number of usages of the cryptographic key.";
			previousVersion_lazy = () -> KEKIdentifier2.mmSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(KEKIdentifier5 obj) {
			return obj.getSequenceNumber();
		}

		@Override
		public void setValue(KEKIdentifier5 obj, Optional<Number> value) {
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
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5 KEKIdentifier5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivtnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification used for derivation of a unique key from a master key provided for the data protection."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier2#mmDerivationIdentification
	 * KEKIdentifier2.mmDerivationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KEKIdentifier5, Optional<Min5Max16Binary>> mmDerivationIdentification = new MMMessageAttribute<KEKIdentifier5, Optional<Min5Max16Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KEKIdentifier5.mmObject();
			isDerived = false;
			xmlTag = "DerivtnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivationIdentification";
			definition = "Identification used for derivation of a unique key from a master key provided for the data protection.";
			previousVersion_lazy = () -> KEKIdentifier2.mmDerivationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Min5Max16Binary.mmObject();
		}

		@Override
		public Optional<Min5Max16Binary> getValue(KEKIdentifier5 obj) {
			return obj.getDerivationIdentification();
		}

		@Override
		public void setValue(KEKIdentifier5 obj, Optional<Min5Max16Binary> value) {
			obj.setDerivationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected CryptographicKeyType3Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code
	 * CryptographicKeyType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5 KEKIdentifier5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of algorithm used by the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KEKIdentifier5, Optional<CryptographicKeyType3Code>> mmType = new MMMessageAttribute<KEKIdentifier5, Optional<CryptographicKeyType3Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KEKIdentifier5.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of algorithm used by the cryptographic key.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CryptographicKeyType3Code.mmObject();
		}

		@Override
		public Optional<CryptographicKeyType3Code> getValue(KEKIdentifier5 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(KEKIdentifier5 obj, Optional<CryptographicKeyType3Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Fctn")
	protected List<KeyUsage1Code> function;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.KEKIdentifier5 KEKIdentifier5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Function"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowed usage of the key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<KEKIdentifier5, List<KeyUsage1Code>> mmFunction = new MMMessageAttribute<KEKIdentifier5, List<KeyUsage1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.KEKIdentifier5.mmObject();
			isDerived = false;
			xmlTag = "Fctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Function";
			definition = "Allowed usage of the key.";
			minOccurs = 0;
			simpleType_lazy = () -> KeyUsage1Code.mmObject();
		}

		@Override
		public List<KeyUsage1Code> getValue(KEKIdentifier5 obj) {
			return obj.getFunction();
		}

		@Override
		public void setValue(KEKIdentifier5 obj, List<KeyUsage1Code> value) {
			obj.setFunction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.KEKIdentifier5.mmKeyIdentification, com.tools20022.repository.msg.KEKIdentifier5.mmKeyVersion,
						com.tools20022.repository.msg.KEKIdentifier5.mmSequenceNumber, com.tools20022.repository.msg.KEKIdentifier5.mmDerivationIdentification, com.tools20022.repository.msg.KEKIdentifier5.mmType,
						com.tools20022.repository.msg.KEKIdentifier5.mmFunction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "KEKIdentifier5";
				definition = "Identification of a key encryption key (KEK), using previously distributed symmetric key.";
				previousVersion_lazy = () -> KEKIdentifier2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max140Text getKeyIdentification() {
		return keyIdentification;
	}

	public KEKIdentifier5 setKeyIdentification(Max140Text keyIdentification) {
		this.keyIdentification = Objects.requireNonNull(keyIdentification);
		return this;
	}

	public Max140Text getKeyVersion() {
		return keyVersion;
	}

	public KEKIdentifier5 setKeyVersion(Max140Text keyVersion) {
		this.keyVersion = Objects.requireNonNull(keyVersion);
		return this;
	}

	public Optional<Number> getSequenceNumber() {
		return sequenceNumber == null ? Optional.empty() : Optional.of(sequenceNumber);
	}

	public KEKIdentifier5 setSequenceNumber(Number sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
		return this;
	}

	public Optional<Min5Max16Binary> getDerivationIdentification() {
		return derivationIdentification == null ? Optional.empty() : Optional.of(derivationIdentification);
	}

	public KEKIdentifier5 setDerivationIdentification(Min5Max16Binary derivationIdentification) {
		this.derivationIdentification = derivationIdentification;
		return this;
	}

	public Optional<CryptographicKeyType3Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public KEKIdentifier5 setType(CryptographicKeyType3Code type) {
		this.type = type;
		return this;
	}

	public List<KeyUsage1Code> getFunction() {
		return function == null ? function = new ArrayList<>() : function;
	}

	public KEKIdentifier5 setFunction(List<KeyUsage1Code> function) {
		this.function = Objects.requireNonNull(function);
		return this;
	}
}