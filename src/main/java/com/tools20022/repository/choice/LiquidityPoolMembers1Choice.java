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
import com.tools20022.repository.msg.AccountOwnerAndIdentification1;
import com.tools20022.repository.msg.AccountOwnerAndIdentificationList1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between head member or subordinate member identifiers of liquidity
 * pool.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LiquidityPoolMembers1Choice#mmHeadMemberDetails
 * LiquidityPoolMembers1Choice.mmHeadMemberDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LiquidityPoolMembers1Choice#mmSubordinateMemberDetails
 * LiquidityPoolMembers1Choice.mmSubordinateMemberDetails}</li>
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
 * "LiquidityPoolMembers1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between head member or subordinate member identifiers of liquidity pool."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LiquidityPoolMembers1Choice", propOrder = {"headMemberDetails", "subordinateMemberDetails"})
public class LiquidityPoolMembers1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "HeadMmbDtls", required = true)
	protected AccountOwnerAndIdentification1 headMemberDetails;
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
	 * {@linkplain com.tools20022.repository.choice.LiquidityPoolMembers1Choice
	 * LiquidityPoolMembers1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HeadMmbDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HeadMemberDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about head member of liquidity pool."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidityPoolMembers1Choice, AccountOwnerAndIdentification1> mmHeadMemberDetails = new MMMessageAssociationEnd<LiquidityPoolMembers1Choice, AccountOwnerAndIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.LiquidityPoolMembers1Choice.mmObject();
			isDerived = false;
			xmlTag = "HeadMmbDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HeadMemberDetails";
			definition = "Information about head member of liquidity pool.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountOwnerAndIdentification1.mmObject();
		}

		@Override
		public AccountOwnerAndIdentification1 getValue(LiquidityPoolMembers1Choice obj) {
			return obj.getHeadMemberDetails();
		}

		@Override
		public void setValue(LiquidityPoolMembers1Choice obj, AccountOwnerAndIdentification1 value) {
			obj.setHeadMemberDetails(value);
		}
	};
	@XmlElement(name = "SubrdntMmbDtls", required = true)
	protected AccountOwnerAndIdentificationList1 subordinateMemberDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AccountOwnerAndIdentificationList1
	 * AccountOwnerAndIdentificationList1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.LiquidityPoolMembers1Choice
	 * LiquidityPoolMembers1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubrdntMmbDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubordinateMemberDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of subordinate liquidity pool member."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidityPoolMembers1Choice, AccountOwnerAndIdentificationList1> mmSubordinateMemberDetails = new MMMessageAssociationEnd<LiquidityPoolMembers1Choice, AccountOwnerAndIdentificationList1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.LiquidityPoolMembers1Choice.mmObject();
			isDerived = false;
			xmlTag = "SubrdntMmbDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubordinateMemberDetails";
			definition = "List of subordinate liquidity pool member.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AccountOwnerAndIdentificationList1.mmObject();
		}

		@Override
		public AccountOwnerAndIdentificationList1 getValue(LiquidityPoolMembers1Choice obj) {
			return obj.getSubordinateMemberDetails();
		}

		@Override
		public void setValue(LiquidityPoolMembers1Choice obj, AccountOwnerAndIdentificationList1 value) {
			obj.setSubordinateMemberDetails(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LiquidityPoolMembers1Choice.mmHeadMemberDetails, com.tools20022.repository.choice.LiquidityPoolMembers1Choice.mmSubordinateMemberDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LiquidityPoolMembers1Choice";
				definition = "Choice between head member or subordinate member identifiers of liquidity pool.";
			}
		});
		return mmObject_lazy.get();
	}

	public AccountOwnerAndIdentification1 getHeadMemberDetails() {
		return headMemberDetails;
	}

	public LiquidityPoolMembers1Choice setHeadMemberDetails(AccountOwnerAndIdentification1 headMemberDetails) {
		this.headMemberDetails = Objects.requireNonNull(headMemberDetails);
		return this;
	}

	public AccountOwnerAndIdentificationList1 getSubordinateMemberDetails() {
		return subordinateMemberDetails;
	}

	public LiquidityPoolMembers1Choice setSubordinateMemberDetails(AccountOwnerAndIdentificationList1 subordinateMemberDetails) {
		this.subordinateMemberDetails = Objects.requireNonNull(subordinateMemberDetails);
		return this;
	}
}