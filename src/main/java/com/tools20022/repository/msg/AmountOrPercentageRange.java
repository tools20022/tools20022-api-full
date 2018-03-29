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
import com.tools20022.repository.codeset.Operation1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Term1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides constrains on a range of business values.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountOrPercentageRange#mmOperation
 * AmountOrPercentageRange.mmOperation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountOrPercentageRange#mmTerm
 * AmountOrPercentageRange.mmTerm}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountOrPercentageRange"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides constrains on a range of business values."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountOrPercentageRange", propOrder = {"operation", "term"})
public class AmountOrPercentageRange {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Opr")
	protected Operation1Code operation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Operation1Code
	 * Operation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountOrPercentageRange
	 * AmountOrPercentageRange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Opr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Operation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication of the relationship between two variables."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountOrPercentageRange, Optional<Operation1Code>> mmOperation = new MMMessageAttribute<AmountOrPercentageRange, Optional<Operation1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountOrPercentageRange.mmObject();
			isDerived = false;
			xmlTag = "Opr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Operation";
			definition = "Indication of the relationship between two variables.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Operation1Code.mmObject();
		}

		@Override
		public Optional<Operation1Code> getValue(AmountOrPercentageRange obj) {
			return obj.getOperation();
		}

		@Override
		public void setValue(AmountOrPercentageRange obj, Optional<Operation1Code> value) {
			obj.setOperation(value.orElse(null));
		}
	};
	@XmlElement(name = "Term")
	protected List<Term1> term;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Term1 Term1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountOrPercentageRange
	 * AmountOrPercentageRange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Term"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Term"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates one of the constraints of a range of business values."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AmountOrPercentageRange, List<Term1>> mmTerm = new MMMessageAssociationEnd<AmountOrPercentageRange, List<Term1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountOrPercentageRange.mmObject();
			isDerived = false;
			xmlTag = "Term";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Term";
			definition = "Indicates one of the constraints of a range of business values.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Term1.mmObject();
		}

		@Override
		public List<Term1> getValue(AmountOrPercentageRange obj) {
			return obj.getTerm();
		}

		@Override
		public void setValue(AmountOrPercentageRange obj, List<Term1> value) {
			obj.setTerm(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountOrPercentageRange.mmOperation, com.tools20022.repository.msg.AmountOrPercentageRange.mmTerm);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountOrPercentageRange";
				definition = "Provides constrains on a range of business values.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Operation1Code> getOperation() {
		return operation == null ? Optional.empty() : Optional.of(operation);
	}

	public AmountOrPercentageRange setOperation(Operation1Code operation) {
		this.operation = operation;
		return this;
	}

	public List<Term1> getTerm() {
		return term == null ? term = new ArrayList<>() : term;
	}

	public AmountOrPercentageRange setTerm(List<Term1> term) {
		this.term = Objects.requireNonNull(term);
		return this;
	}
}