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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SecuritiesAccountOrBusinessError2Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesAccount19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to report information about securities account reference
 * data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReport2#mmSecuritiesAccountIdentification
 * SecuritiesAccountReport2.mmSecuritiesAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReport2#mmSecuritiesAccountOrError
 * SecuritiesAccountReport2.mmSecuritiesAccountOrError}</li>
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
 * "SecuritiesAccountReport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to report information about securities account reference data."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReport1
 * SecuritiesAccountReport1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccountReport2", propOrder = {"securitiesAccountIdentification", "securitiesAccountOrError"})
public class SecuritiesAccountReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesAcctId", required = true)
	protected SecuritiesAccount19 securitiesAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReport2
	 * SecuritiesAccountReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReport1#mmSecuritiesAccountIdentification
	 * SecuritiesAccountReport1.mmSecuritiesAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAccountReport2, SecuritiesAccount19> mmSecuritiesAccountIdentification = new MMMessageAssociationEnd<SecuritiesAccountReport2, SecuritiesAccount19>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReport2.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			previousVersion_lazy = () -> SecuritiesAccountReport1.mmSecuritiesAccountIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount19.mmObject();
		}

		@Override
		public SecuritiesAccount19 getValue(SecuritiesAccountReport2 obj) {
			return obj.getSecuritiesAccountIdentification();
		}

		@Override
		public void setValue(SecuritiesAccountReport2 obj, SecuritiesAccount19 value) {
			obj.setSecuritiesAccountIdentification(value);
		}
	};
	@XmlElement(name = "SctiesAcctOrErr", required = true)
	protected SecuritiesAccountOrBusinessError2Choice securitiesAccountOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesAccountOrBusinessError2Choice
	 * SecuritiesAccountOrBusinessError2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReport2
	 * SecuritiesAccountReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctOrErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the returned securities account reference data or error information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReport1#mmSecuritiesAccountOrError
	 * SecuritiesAccountReport1.mmSecuritiesAccountOrError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAccountReport2, SecuritiesAccountOrBusinessError2Choice> mmSecuritiesAccountOrError = new MMMessageAssociationEnd<SecuritiesAccountReport2, SecuritiesAccountOrBusinessError2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReport2.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountOrError";
			definition = "Identifies the returned securities account reference data or error information.";
			previousVersion_lazy = () -> SecuritiesAccountReport1.mmSecuritiesAccountOrError;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccountOrBusinessError2Choice.mmObject();
		}

		@Override
		public SecuritiesAccountOrBusinessError2Choice getValue(SecuritiesAccountReport2 obj) {
			return obj.getSecuritiesAccountOrError();
		}

		@Override
		public void setValue(SecuritiesAccountReport2 obj, SecuritiesAccountOrBusinessError2Choice value) {
			obj.setSecuritiesAccountOrError(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccountReport2.mmSecuritiesAccountIdentification, com.tools20022.repository.msg.SecuritiesAccountReport2.mmSecuritiesAccountOrError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountReport2";
				definition = "Set of elements used to report information about securities account reference data.";
				previousVersion_lazy = () -> SecuritiesAccountReport1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccount19 getSecuritiesAccountIdentification() {
		return securitiesAccountIdentification;
	}

	public SecuritiesAccountReport2 setSecuritiesAccountIdentification(SecuritiesAccount19 securitiesAccountIdentification) {
		this.securitiesAccountIdentification = Objects.requireNonNull(securitiesAccountIdentification);
		return this;
	}

	public SecuritiesAccountOrBusinessError2Choice getSecuritiesAccountOrError() {
		return securitiesAccountOrError;
	}

	public SecuritiesAccountReport2 setSecuritiesAccountOrError(SecuritiesAccountOrBusinessError2Choice securitiesAccountOrError) {
		this.securitiesAccountOrError = Objects.requireNonNull(securitiesAccountOrError);
		return this;
	}
}