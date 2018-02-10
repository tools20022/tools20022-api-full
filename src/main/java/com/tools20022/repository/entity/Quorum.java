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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.QuorumQuantity1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Meeting1;
import com.tools20022.repository.msg.Meeting2;
import com.tools20022.repository.msg.Meeting3;
import com.tools20022.repository.msg.Meeting4;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies whether a quorum is required or not together with the quorum
 * parameters.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Quorum" src="doc-files/Quorum.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Quorum#mmQuantity
 * Quorum.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quorum#mmPercentage
 * Quorum.mmPercentage}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quorum#mmQuorumRequired
 * Quorum.mmQuorumRequired}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quorum#mmMeeting
 * Quorum.mmMeeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Meeting#mmQuorum
 * Meeting.mmQuorum}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.QuorumQuantity1Choice
 * QuorumQuantity1Choice}</li>
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
 * "Quorum"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether a quorum is required or not together with the quorum parameters."
 * </li>
 * </ul>
 */
public class Quorum {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#mmQuorumQuantity
	 * Meeting1.mmQuorumQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#mmQuorumQuantity
	 * Meeting2.mmQuorumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.QuorumQuantity1Choice#mmQuorumQuantity
	 * QuorumQuantity1Choice.mmQuorumQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#mmQuorumQuantity
	 * Meeting3.mmQuorumQuantity}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#mmQuorumQuantity
	 * Meeting4.mmQuorumQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quorum
	 * Quorum}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities required to hold a meeting."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuantity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Meeting1.mmQuorumQuantity, Meeting2.mmQuorumQuantity, QuorumQuantity1Choice.mmQuorumQuantity, Meeting3.mmQuorumQuantity, Meeting4.mmQuorumQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quorum.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Minimum quantity of securities required to hold a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Quorum.class.getMethod("getQuantity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate percentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Meeting1#mmQuorumQuantityPercentage
	 * Meeting1.mmQuorumQuantityPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Meeting2#mmQuorumQuantityPercentage
	 * Meeting2.mmQuorumQuantityPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.QuorumQuantity1Choice#mmQuorumQuantityPercentage
	 * QuorumQuantity1Choice.mmQuorumQuantityPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quorum
	 * Quorum}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities, expressed as a percentage, required to hold a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPercentage = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Meeting1.mmQuorumQuantityPercentage, Meeting2.mmQuorumQuantityPercentage, QuorumQuantity1Choice.mmQuorumQuantityPercentage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quorum.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Percentage";
			definition = "Minimum quantity of securities, expressed as a percentage, required to hold a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Quorum.class.getMethod("getPercentage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator quorumRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#mmQuorumRequired
	 * Meeting1.mmQuorumRequired}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#mmQuorumRequired
	 * Meeting2.mmQuorumRequired}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting3#mmQuorumRequired
	 * Meeting3.mmQuorumRequired}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting4#mmQuorumRequired
	 * Meeting4.mmQuorumRequired}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quorum
	 * Quorum}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuorumRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a minimum number of security representation is required to hold a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuorumRequired = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Meeting1.mmQuorumRequired, Meeting2.mmQuorumRequired, Meeting3.mmQuorumRequired, Meeting4.mmQuorumRequired);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quorum.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuorumRequired";
			definition = "Specifies whether a minimum number of security representation is required to hold a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Quorum.class.getMethod("getQuorumRequired", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Meeting meeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmQuorum
	 * Meeting.mmQuorum}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Quorum
	 * Quorum}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting for which a quorum is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMeeting = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Quorum.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Meeting";
			definition = "Meeting for which a quorum is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Meeting.mmQuorum;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Meeting.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Quorum";
				definition = "Specifies whether a quorum is required or not together with the quorum parameters.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Meeting.mmQuorum);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Quorum.mmQuantity, com.tools20022.repository.entity.Quorum.mmPercentage, com.tools20022.repository.entity.Quorum.mmQuorumRequired,
						com.tools20022.repository.entity.Quorum.mmMeeting);
				derivationComponent_lazy = () -> Arrays.asList(QuorumQuantity1Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Quorum.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getQuantity() {
		return quantity;
	}

	public Quorum setQuantity(Max35Text quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public Quorum setPercentage(PercentageRate percentage) {
		this.percentage = Objects.requireNonNull(percentage);
		return this;
	}

	public YesNoIndicator getQuorumRequired() {
		return quorumRequired;
	}

	public Quorum setQuorumRequired(YesNoIndicator quorumRequired) {
		this.quorumRequired = Objects.requireNonNull(quorumRequired);
		return this;
	}

	public Optional<Meeting> getMeeting() {
		return meeting == null ? Optional.empty() : Optional.of(meeting);
	}

	public Quorum setMeeting(com.tools20022.repository.entity.Meeting meeting) {
		this.meeting = meeting;
		return this;
	}
}