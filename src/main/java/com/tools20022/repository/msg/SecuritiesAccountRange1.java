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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesAccount13;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a range of securities accounts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccountRange1#mmFrom
 * SecuritiesAccountRange1.mmFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccountRange1#mmTo
 * SecuritiesAccountRange1.mmTo}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesAccountRange1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a range of securities accounts."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccountRange2
 * SecuritiesAccountRange2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccountRange1", propOrder = {"from", "to"})
public class SecuritiesAccountRange1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Fr", required = true)
	protected SecuritiesAccount13 from;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountRange1
	 * SecuritiesAccountRange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "From"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities account number or code at which the range starts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountRange2#mmFrom
	 * SecuritiesAccountRange2.mmFrom}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAccountRange1, SecuritiesAccount13> mmFrom = new MMMessageAssociationEnd<SecuritiesAccountRange1, SecuritiesAccount13>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountRange1.mmObject();
			isDerived = false;
			xmlTag = "Fr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "From";
			definition = "Securities account number or code at which the range starts.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountRange2.mmFrom);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public SecuritiesAccount13 getValue(SecuritiesAccountRange1 obj) {
			return obj.getFrom();
		}

		@Override
		public void setValue(SecuritiesAccountRange1 obj, SecuritiesAccount13 value) {
			obj.setFrom(value);
		}
	};
	@XmlElement(name = "To", required = true)
	protected SecuritiesAccount13 to;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountRange1
	 * SecuritiesAccountRange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "To"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "To"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities account number or code at which the range ends."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountRange2#mmTo
	 * SecuritiesAccountRange2.mmTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAccountRange1, SecuritiesAccount13> mmTo = new MMMessageAssociationEnd<SecuritiesAccountRange1, SecuritiesAccount13>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountRange1.mmObject();
			isDerived = false;
			xmlTag = "To";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "To";
			definition = "Securities account number or code at which the range ends.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountRange2.mmTo);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public SecuritiesAccount13 getValue(SecuritiesAccountRange1 obj) {
			return obj.getTo();
		}

		@Override
		public void setValue(SecuritiesAccountRange1 obj, SecuritiesAccount13 value) {
			obj.setTo(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccountRange1.mmFrom, com.tools20022.repository.msg.SecuritiesAccountRange1.mmTo);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountRange1";
				definition = "Specifies a range of securities accounts.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountRange2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccount13 getFrom() {
		return from;
	}

	public SecuritiesAccountRange1 setFrom(SecuritiesAccount13 from) {
		this.from = Objects.requireNonNull(from);
		return this;
	}

	public SecuritiesAccount13 getTo() {
		return to;
	}

	public SecuritiesAccountRange1 setTo(SecuritiesAccount13 to) {
		this.to = Objects.requireNonNull(to);
		return this;
	}
}