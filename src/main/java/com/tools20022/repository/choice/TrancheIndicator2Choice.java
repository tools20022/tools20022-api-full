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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.NoReasonCode;
import com.tools20022.repository.entity.Tranche;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Tranche2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indication whether a derivative contract is tranched.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TrancheIndicator2Choice#mmTranched
 * TrancheIndicator2Choice.mmTranched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TrancheIndicator2Choice#mmUntranched
 * TrancheIndicator2Choice.mmUntranched}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tranche Tranche}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TrancheIndicator2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indication whether a derivative contract is tranched."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TrancheIndicator2Choice", propOrder = {"tranched", "untranched"})
public class TrancheIndicator2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Trnchd", required = true)
	protected Tranche2 tranched;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tranche2 Tranche2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TrancheIndicator2Choice
	 * TrancheIndicator2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trnchd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tranched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indication that derivative contract is tranched."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TrancheIndicator2Choice, Tranche2> mmTranched = new MMMessageAssociationEnd<TrancheIndicator2Choice, Tranche2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TrancheIndicator2Choice.mmObject();
			isDerived = false;
			xmlTag = "Trnchd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tranched";
			definition = "Indication that derivative contract is tranched.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Tranche2.mmObject();
		}

		@Override
		public Tranche2 getValue(TrancheIndicator2Choice obj) {
			return obj.getTranched();
		}

		@Override
		public void setValue(TrancheIndicator2Choice obj, Tranche2 value) {
			obj.setTranched(value);
		}
	};
	@XmlElement(name = "Utrnchd", required = true)
	protected NoReasonCode untranched;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.NoReasonCode
	 * NoReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TrancheIndicator2Choice
	 * TrancheIndicator2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Utrnchd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Untranched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that derivative contract is untranched."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TrancheIndicator2Choice, NoReasonCode> mmUntranched = new MMMessageAttribute<TrancheIndicator2Choice, NoReasonCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TrancheIndicator2Choice.mmObject();
			isDerived = false;
			xmlTag = "Utrnchd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Untranched";
			definition = "Indicates that derivative contract is untranched.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NoReasonCode.mmObject();
		}

		@Override
		public NoReasonCode getValue(TrancheIndicator2Choice obj) {
			return obj.getUntranched();
		}

		@Override
		public void setValue(TrancheIndicator2Choice obj, NoReasonCode value) {
			obj.setUntranched(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TrancheIndicator2Choice.mmTranched, com.tools20022.repository.choice.TrancheIndicator2Choice.mmUntranched);
				trace_lazy = () -> Tranche.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TrancheIndicator2Choice";
				definition = "Indication whether a derivative contract is tranched.";
			}
		});
		return mmObject_lazy.get();
	}

	public Tranche2 getTranched() {
		return tranched;
	}

	public TrancheIndicator2Choice setTranched(Tranche2 tranched) {
		this.tranched = Objects.requireNonNull(tranched);
		return this;
	}

	public NoReasonCode getUntranched() {
		return untranched;
	}

	public TrancheIndicator2Choice setUntranched(NoReasonCode untranched) {
		this.untranched = Objects.requireNonNull(untranched);
		return this;
	}
}