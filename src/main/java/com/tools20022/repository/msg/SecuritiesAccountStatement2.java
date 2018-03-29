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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange2;
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
 * Provides system date for all of the changes occurred for an entity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatement2#mmSystemDate
 * SecuritiesAccountStatement2.mmSystemDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatement2#mmChange
 * SecuritiesAccountStatement2.mmChange}</li>
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
 * "SecuritiesAccountStatement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides system date for all of the changes occurred for an entity."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatement1
 * SecuritiesAccountStatement1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccountStatement2", propOrder = {"systemDate", "change"})
public class SecuritiesAccountStatement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysDt", required = true)
	protected ISODate systemDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatement2
	 * SecuritiesAccountStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date for which the statement is valid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatement1#mmSystemDate
	 * SecuritiesAccountStatement1.mmSystemDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountStatement2, ISODate> mmSystemDate = new MMMessageAttribute<SecuritiesAccountStatement2, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountStatement2.mmObject();
			isDerived = false;
			xmlTag = "SysDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemDate";
			definition = "Date for which the statement is valid.";
			previousVersion_lazy = () -> SecuritiesAccountStatement1.mmSystemDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(SecuritiesAccountStatement2 obj) {
			return obj.getSystemDate();
		}

		@Override
		public void setValue(SecuritiesAccountStatement2 obj, ISODate value) {
			obj.setSystemDate(value);
		}
	};
	@XmlElement(name = "Chng")
	protected List<SecuritiesAccountReferenceDataChange2> change;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange2
	 * SecuritiesAccountReferenceDataChange2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatement2
	 * SecuritiesAccountStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the actual change occurred to a securities account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountStatement1#mmChange
	 * SecuritiesAccountStatement1.mmChange}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAccountStatement2, List<SecuritiesAccountReferenceDataChange2>> mmChange = new MMMessageAssociationEnd<SecuritiesAccountStatement2, List<SecuritiesAccountReferenceDataChange2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountStatement2.mmObject();
			isDerived = false;
			xmlTag = "Chng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			definition = "Provides information on the actual change occurred to a securities account.";
			previousVersion_lazy = () -> SecuritiesAccountStatement1.mmChange;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesAccountReferenceDataChange2.mmObject();
		}

		@Override
		public List<SecuritiesAccountReferenceDataChange2> getValue(SecuritiesAccountStatement2 obj) {
			return obj.getChange();
		}

		@Override
		public void setValue(SecuritiesAccountStatement2 obj, List<SecuritiesAccountReferenceDataChange2> value) {
			obj.setChange(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccountStatement2.mmSystemDate, com.tools20022.repository.msg.SecuritiesAccountStatement2.mmChange);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountStatement2";
				definition = "Provides system date for all of the changes occurred for an entity.";
				previousVersion_lazy = () -> SecuritiesAccountStatement1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getSystemDate() {
		return systemDate;
	}

	public SecuritiesAccountStatement2 setSystemDate(ISODate systemDate) {
		this.systemDate = Objects.requireNonNull(systemDate);
		return this;
	}

	public List<SecuritiesAccountReferenceDataChange2> getChange() {
		return change == null ? change = new ArrayList<>() : change;
	}

	public SecuritiesAccountStatement2 setChange(List<SecuritiesAccountReferenceDataChange2> change) {
		this.change = Objects.requireNonNull(change);
		return this;
	}
}