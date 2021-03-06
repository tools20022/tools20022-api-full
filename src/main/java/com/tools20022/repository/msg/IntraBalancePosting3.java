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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.BookEntry;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown2;
import com.tools20022.repository.msg.IntraBalancePosting4;
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
 * Provides the transactions in the report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePosting3#mmBalanceFrom
 * IntraBalancePosting3.mmBalanceFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalancePosting3#mmMovement
 * IntraBalancePosting3.mmMovement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraBalancePosting3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the transactions in the report."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraBalancePosting1
 * IntraBalancePosting1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraBalancePosting3", propOrder = {"balanceFrom", "movement"})
public class IntraBalancePosting3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BalFr", required = true)
	protected CashSubBalanceTypeAndQuantityBreakdown2 balanceFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown2
	 * CashSubBalanceTypeAndQuantityBreakdown2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePosting3
	 * IntraBalancePosting3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the amount of money is moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::FROM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePosting1#mmBalanceFrom
	 * IntraBalancePosting1.mmBalanceFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalancePosting3, CashSubBalanceTypeAndQuantityBreakdown2> mmBalanceFrom = new MMMessageAssociationEnd<IntraBalancePosting3, CashSubBalanceTypeAndQuantityBreakdown2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePosting3.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::FROM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the amount of money is moved.";
			previousVersion_lazy = () -> IntraBalancePosting1.mmBalanceFrom;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashSubBalanceTypeAndQuantityBreakdown2.mmObject();
		}

		@Override
		public CashSubBalanceTypeAndQuantityBreakdown2 getValue(IntraBalancePosting3 obj) {
			return obj.getBalanceFrom();
		}

		@Override
		public void setValue(IntraBalancePosting3 obj, CashSubBalanceTypeAndQuantityBreakdown2 value) {
			obj.setBalanceFrom(value);
		}
	};
	@XmlElement(name = "Mvmnt", required = true)
	protected List<IntraBalancePosting4> movement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IntraBalancePosting4
	 * IntraBalancePosting4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePosting3
	 * IntraBalancePosting3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mvmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Movement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the individual transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalancePosting1#mmMovement
	 * IntraBalancePosting1.mmMovement}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalancePosting3, List<IntraBalancePosting4>> mmMovement = new MMMessageAssociationEnd<IntraBalancePosting3, List<IntraBalancePosting4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalancePosting3.mmObject();
			isDerived = false;
			xmlTag = "Mvmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Movement";
			definition = "Identifies the individual transaction.";
			previousVersion_lazy = () -> IntraBalancePosting1.mmMovement;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IntraBalancePosting4.mmObject();
		}

		@Override
		public List<IntraBalancePosting4> getValue(IntraBalancePosting3 obj) {
			return obj.getMovement();
		}

		@Override
		public void setValue(IntraBalancePosting3 obj, List<IntraBalancePosting4> value) {
			obj.setMovement(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraBalancePosting3.mmBalanceFrom, com.tools20022.repository.msg.IntraBalancePosting3.mmMovement);
				trace_lazy = () -> BookEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalancePosting3";
				definition = "Provides the transactions in the report.";
				previousVersion_lazy = () -> IntraBalancePosting1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CashSubBalanceTypeAndQuantityBreakdown2 getBalanceFrom() {
		return balanceFrom;
	}

	public IntraBalancePosting3 setBalanceFrom(CashSubBalanceTypeAndQuantityBreakdown2 balanceFrom) {
		this.balanceFrom = Objects.requireNonNull(balanceFrom);
		return this;
	}

	public List<IntraBalancePosting4> getMovement() {
		return movement == null ? movement = new ArrayList<>() : movement;
	}

	public IntraBalancePosting3 setMovement(List<IntraBalancePosting4> movement) {
		this.movement = Objects.requireNonNull(movement);
		return this;
	}
}