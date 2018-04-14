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
import com.tools20022.repository.datatype.YesNoIndicator;
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
 * Defines the account to or from which a securities entry is made and the usage
 * type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuanceAccount2#mmIssuanceAccount
 * IssuanceAccount2.mmIssuanceAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuanceAccount2#mmPrimaryAccountIndicator
 * IssuanceAccount2.mmPrimaryAccountIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IssuanceAccount2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the account to or from which a securities entry is made and the usage type."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IssuanceAccount1 IssuanceAccount1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IssuanceAccount2", propOrder = {"issuanceAccount", "primaryAccountIndicator"})
public class IssuanceAccount2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IssncAcct", required = true)
	protected SecuritiesAccount19 issuanceAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IssuanceAccount2
	 * IssuanceAccount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssncAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuanceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IssuanceAccount1#mmIssuanceAccount
	 * IssuanceAccount1.mmIssuanceAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IssuanceAccount2, SecuritiesAccount19> mmIssuanceAccount = new MMMessageAttribute<IssuanceAccount2, SecuritiesAccount19>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IssuanceAccount2.mmObject();
			isDerived = false;
			xmlTag = "IssncAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuanceAccount";
			definition = "Account to or from which a securities entry is made.";
			previousVersion_lazy = () -> IssuanceAccount1.mmIssuanceAccount;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecuritiesAccount19.mmObject();
		}

		@Override
		public SecuritiesAccount19 getValue(IssuanceAccount2 obj) {
			return obj.getIssuanceAccount();
		}

		@Override
		public void setValue(IssuanceAccount2 obj, SecuritiesAccount19 value) {
			obj.setIssuanceAccount(value);
		}
	};
	@XmlElement(name = "PmryAcctInd", required = true)
	protected YesNoIndicator primaryAccountIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IssuanceAccount2
	 * IssuanceAccount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryAcctInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryAccountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines if the related issuance account is the primary account or not."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IssuanceAccount1#mmPrimaryAccountIndicator
	 * IssuanceAccount1.mmPrimaryAccountIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IssuanceAccount2, YesNoIndicator> mmPrimaryAccountIndicator = new MMMessageAttribute<IssuanceAccount2, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IssuanceAccount2.mmObject();
			isDerived = false;
			xmlTag = "PmryAcctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryAccountIndicator";
			definition = "Defines if the related issuance account is the primary account or not.";
			previousVersion_lazy = () -> IssuanceAccount1.mmPrimaryAccountIndicator;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(IssuanceAccount2 obj) {
			return obj.getPrimaryAccountIndicator();
		}

		@Override
		public void setValue(IssuanceAccount2 obj, YesNoIndicator value) {
			obj.setPrimaryAccountIndicator(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IssuanceAccount2.mmIssuanceAccount, com.tools20022.repository.msg.IssuanceAccount2.mmPrimaryAccountIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IssuanceAccount2";
				definition = "Defines the account to or from which a securities entry is made and the usage type.";
				previousVersion_lazy = () -> IssuanceAccount1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccount19 getIssuanceAccount() {
		return issuanceAccount;
	}

	public IssuanceAccount2 setIssuanceAccount(SecuritiesAccount19 issuanceAccount) {
		this.issuanceAccount = Objects.requireNonNull(issuanceAccount);
		return this;
	}

	public YesNoIndicator getPrimaryAccountIndicator() {
		return primaryAccountIndicator;
	}

	public IssuanceAccount2 setPrimaryAccountIndicator(YesNoIndicator primaryAccountIndicator) {
		this.primaryAccountIndicator = Objects.requireNonNull(primaryAccountIndicator);
		return this;
	}
}