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
import com.tools20022.repository.msg.KEK1;
import com.tools20022.repository.msg.KeyTransport1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Transport key or key encryption key (KEK) for the recipient.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Recipient1Choice#mmKeyTransport
 * Recipient1Choice.mmKeyTransport}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Recipient1Choice#mmKEK
 * Recipient1Choice.mmKEK}</li>
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
 * "Recipient1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transport key or key encryption key (KEK) for the recipient."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.Recipient2Choice
 * Recipient2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class Recipient1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected KeyTransport1 keyTransport;
	/**
	 * Encryption key using previously distributed asymmetric key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KeyTransport1
	 * KeyTransport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient1Choice
	 * Recipient1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyTrnsprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encryption key using previously distributed asymmetric key."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKeyTransport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Recipient1Choice.mmObject();
			isDerived = false;
			xmlTag = "KeyTrnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyTransport";
			definition = "Encryption key using previously distributed asymmetric key.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> KeyTransport1.mmObject();
		}
	};
	protected KEK1 kEK;
	/**
	 * Encryption key using previously distributed symmetric key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEK1 KEK1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Recipient1Choice
	 * Recipient1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KEK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KEK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encryption key using previously distributed symmetric key."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKEK = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Recipient1Choice.mmObject();
			isDerived = false;
			xmlTag = "KEK";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KEK";
			definition = "Encryption key using previously distributed symmetric key.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> KEK1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Recipient1Choice.mmKeyTransport, Recipient1Choice.mmKEK);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Recipient1Choice";
				definition = "Transport key or key encryption key (KEK) for the recipient.";
				nextVersions_lazy = () -> Arrays.asList(Recipient2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public KeyTransport1 getKeyTransport() {
		return keyTransport;
	}

	public void setKeyTransport(KeyTransport1 keyTransport) {
		this.keyTransport = keyTransport;
	}

	public KEK1 getKEK() {
		return kEK;
	}

	public void setKEK(KEK1 kEK) {
		this.kEK = kEK;
	}
}