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
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Configuration of the cryptographic keys.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration2#mmMaximumSymmetricKey
 * ATMSecurityConfiguration2.mmMaximumSymmetricKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration2#mmMaximumAsymmetricKey
 * ATMSecurityConfiguration2.mmMaximumAsymmetricKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration2#mmMaximumRSAKeyLength
 * ATMSecurityConfiguration2.mmMaximumRSAKeyLength}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration2#mmMaximumRootKeyLength
 * ATMSecurityConfiguration2.mmMaximumRootKeyLength}</li>
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
 * "ATMSecurityConfiguration2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration of the cryptographic keys."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3
 * ATMSecurityConfiguration3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
 * ATMSecurityConfiguration1}</li>
 * </ul>
 */
public class ATMSecurityConfiguration2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number maximumSymmetricKey;
	/**
	 * Maximum number of symmetric keys the security module is able to manage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration2
	 * ATMSecurityConfiguration2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxSmmtrcKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumSymmetricKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of symmetric keys the security module is able to manage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumSymmetricKey = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration2.mmObject();
			isDerived = false;
			xmlTag = "MaxSmmtrcKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumSymmetricKey";
			definition = "Maximum number of symmetric keys the security module is able to manage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number maximumAsymmetricKey;
	/**
	 * Maximum number of asymmetric keys the security module is able to manage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration2
	 * ATMSecurityConfiguration2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAsmmtrcKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAsymmetricKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of asymmetric keys the security module is able to manage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumAsymmetricKey = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration2.mmObject();
			isDerived = false;
			xmlTag = "MaxAsmmtrcKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAsymmetricKey";
			definition = "Maximum number of asymmetric keys the security module is able to manage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number maximumRSAKeyLength;
	/**
	 * Maximum RSA key length (in number of bytes), the security module is able
	 * to manage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration2
	 * ATMSecurityConfiguration2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxRSAKeyLngth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRSAKeyLength"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum RSA key length (in number of bytes), the security module is able to manage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumRSAKeyLength = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration2.mmObject();
			isDerived = false;
			xmlTag = "MaxRSAKeyLngth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumRSAKeyLength";
			definition = "Maximum RSA key length (in number of bytes), the security module is able to manage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number maximumRootKeyLength;
	/**
	 * Maximum RSA root key length (in number of bytes), the security module is
	 * able to manage, if different from the maximum RSA key length.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration2
	 * ATMSecurityConfiguration2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxRootKeyLngth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumRootKeyLength"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum RSA root key length (in number of bytes), the security module is able to manage, if different from the maximum RSA key length."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumRootKeyLength = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration2.mmObject();
			isDerived = false;
			xmlTag = "MaxRootKeyLngth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumRootKeyLength";
			definition = "Maximum RSA root key length (in number of bytes), the security module is able to manage, if different from the maximum RSA key length.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMSecurityConfiguration2.mmMaximumSymmetricKey, ATMSecurityConfiguration2.mmMaximumAsymmetricKey, ATMSecurityConfiguration2.mmMaximumRSAKeyLength,
						ATMSecurityConfiguration2.mmMaximumRootKeyLength);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityConfiguration2";
				definition = "Configuration of the cryptographic keys.";
				nextVersions_lazy = () -> Arrays.asList(ATMSecurityConfiguration3.mmObject());
				previousVersion_lazy = () -> ATMSecurityConfiguration1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Number getMaximumSymmetricKey() {
		return maximumSymmetricKey;
	}

	public void setMaximumSymmetricKey(Number maximumSymmetricKey) {
		this.maximumSymmetricKey = maximumSymmetricKey;
	}

	public Number getMaximumAsymmetricKey() {
		return maximumAsymmetricKey;
	}

	public void setMaximumAsymmetricKey(Number maximumAsymmetricKey) {
		this.maximumAsymmetricKey = maximumAsymmetricKey;
	}

	public Number getMaximumRSAKeyLength() {
		return maximumRSAKeyLength;
	}

	public void setMaximumRSAKeyLength(Number maximumRSAKeyLength) {
		this.maximumRSAKeyLength = maximumRSAKeyLength;
	}

	public Number getMaximumRootKeyLength() {
		return maximumRootKeyLength;
	}

	public void setMaximumRootKeyLength(Number maximumRootKeyLength) {
		this.maximumRootKeyLength = maximumRootKeyLength;
	}
}