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
import com.tools20022.repository.msg.AccountOwnerAndIdentification1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * List of account owner and identifiers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountOwnerAndIdentificationList1#mmList
 * AccountOwnerAndIdentificationList1.mmList}</li>
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
 * "AccountOwnerAndIdentificationList1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "List of account owner and identifiers."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountOwnerAndIdentificationList1", propOrder = "list")
public class AccountOwnerAndIdentificationList1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "List", required = true)
	protected List<AccountOwnerAndIdentification1> list;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AccountOwnerAndIdentification1
	 * AccountOwnerAndIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountOwnerAndIdentificationList1
	 * AccountOwnerAndIdentificationList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "List"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "List"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of the identifier pairs."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountOwnerAndIdentificationList1, List<AccountOwnerAndIdentification1>> mmList = new MMMessageAssociationEnd<AccountOwnerAndIdentificationList1, List<AccountOwnerAndIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountOwnerAndIdentificationList1.mmObject();
			isDerived = false;
			xmlTag = "List";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "List";
			definition = "List of the identifier pairs.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountOwnerAndIdentification1.mmObject();
		}

		@Override
		public List<AccountOwnerAndIdentification1> getValue(AccountOwnerAndIdentificationList1 obj) {
			return obj.getList();
		}

		@Override
		public void setValue(AccountOwnerAndIdentificationList1 obj, List<AccountOwnerAndIdentification1> value) {
			obj.setList(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountOwnerAndIdentificationList1.mmList);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountOwnerAndIdentificationList1";
				definition = "List of account owner and identifiers.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<AccountOwnerAndIdentification1> getList() {
		return list == null ? list = new ArrayList<>() : list;
	}

	public AccountOwnerAndIdentificationList1 setList(List<AccountOwnerAndIdentification1> list) {
		this.list = Objects.requireNonNull(list);
		return this;
	}
}