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
import com.tools20022.repository.choice.SecuritiesAccountModification1Choice;
import com.tools20022.repository.codeset.DataModification1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the kind of modification request for securities account
 * reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountModification1#mmScopeIndication
 * SecuritiesAccountModification1.mmScopeIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountModification1#mmRequestedModification
 * SecuritiesAccountModification1.mmRequestedModification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesAccountModification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the kind of modification request for securities account reference data."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccountModification1", propOrder = {"scopeIndication", "requestedModification"})
public class SecuritiesAccountModification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ScpIndctn", required = true)
	protected DataModification1Code scopeIndication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataModification1Code
	 * DataModification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountModification1
	 * SecuritiesAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScpIndctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScopeIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of requested modification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountModification1, DataModification1Code> mmScopeIndication = new MMMessageAttribute<SecuritiesAccountModification1, DataModification1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "ScpIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScopeIndication";
			definition = "Specifies the type of requested modification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataModification1Code.mmObject();
		}

		@Override
		public DataModification1Code getValue(SecuritiesAccountModification1 obj) {
			return obj.getScopeIndication();
		}

		@Override
		public void setValue(SecuritiesAccountModification1 obj, DataModification1Code value) {
			obj.setScopeIndication(value);
		}
	};
	@XmlElement(name = "ReqdMod", required = true)
	protected SecuritiesAccountModification1Choice requestedModification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountModification1Choice
	 * SecuritiesAccountModification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountModification1
	 * SecuritiesAccountModification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdMod"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the elements to be modified for the securities account reference data."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAccountModification1, SecuritiesAccountModification1Choice> mmRequestedModification = new MMMessageAssociationEnd<SecuritiesAccountModification1, SecuritiesAccountModification1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountModification1.mmObject();
			isDerived = false;
			xmlTag = "ReqdMod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedModification";
			definition = "Specifies the elements to be modified for the securities account reference data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccountModification1Choice.mmObject();
		}

		@Override
		public SecuritiesAccountModification1Choice getValue(SecuritiesAccountModification1 obj) {
			return obj.getRequestedModification();
		}

		@Override
		public void setValue(SecuritiesAccountModification1 obj, SecuritiesAccountModification1Choice value) {
			obj.setRequestedModification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccountModification1.mmScopeIndication, com.tools20022.repository.msg.SecuritiesAccountModification1.mmRequestedModification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountModification1";
				definition = "Information about the kind of modification request for securities account reference data.";
			}
		});
		return mmObject_lazy.get();
	}

	public DataModification1Code getScopeIndication() {
		return scopeIndication;
	}

	public SecuritiesAccountModification1 setScopeIndication(DataModification1Code scopeIndication) {
		this.scopeIndication = Objects.requireNonNull(scopeIndication);
		return this;
	}

	public SecuritiesAccountModification1Choice getRequestedModification() {
		return requestedModification;
	}

	public SecuritiesAccountModification1 setRequestedModification(SecuritiesAccountModification1Choice requestedModification) {
		this.requestedModification = Objects.requireNonNull(requestedModification);
		return this;
	}
}