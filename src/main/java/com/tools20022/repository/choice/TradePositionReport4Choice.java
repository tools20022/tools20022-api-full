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
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the relevant action types for trade positions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice#mmNew
 * TradePositionReport4Choice.mmNew}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice#mmModification
 * TradePositionReport4Choice.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice#mmCorrection
 * TradePositionReport4Choice.mmCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice#mmEarlyTermination
 * TradePositionReport4Choice.mmEarlyTermination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice#mmValuationUpdate
 * TradePositionReport4Choice.mmValuationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice#mmError
 * TradePositionReport4Choice.mmError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice#mmOther
 * TradePositionReport4Choice.mmOther}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradePositionReport4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the relevant action types for trade positions."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradePositionReport4Choice", propOrder = {"new_", "modification", "correction", "earlyTermination", "valuationUpdate", "error", "other"})
public class TradePositionReport4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "New", required = true)
	protected TradeNewPosition3 new_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeNewPosition3
	 * TradeNewPosition3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice
	 * TradePositionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "New"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "New"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether position is reported for the first time."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePositionReport4Choice, TradeNewPosition3> mmNew = new MMMessageAssociationEnd<TradePositionReport4Choice, TradeNewPosition3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradePositionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "New";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "New";
			definition = "Indicates whether position is reported for the first time.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeNewPosition3.mmObject();
		}

		@Override
		public TradeNewPosition3 getValue(TradePositionReport4Choice obj) {
			return obj.getNew();
		}

		@Override
		public void setValue(TradePositionReport4Choice obj, TradeNewPosition3 value) {
			obj.setNew(value);
		}
	};
	@XmlElement(name = "Mod", required = true)
	protected TradePositionModification3 modification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradePositionModification3
	 * TradePositionModification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice
	 * TradePositionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mod"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a modification to the terms or details of a previously reported position, but not a correction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePositionReport4Choice, TradePositionModification3> mmModification = new MMMessageAssociationEnd<TradePositionReport4Choice, TradePositionModification3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradePositionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Indicates a modification to the terms or details of a previously reported position, but not a correction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradePositionModification3.mmObject();
		}

		@Override
		public TradePositionModification3 getValue(TradePositionReport4Choice obj) {
			return obj.getModification();
		}

		@Override
		public void setValue(TradePositionReport4Choice obj, TradePositionModification3 value) {
			obj.setModification(value);
		}
	};
	@XmlElement(name = "Crrctn", required = true)
	protected TradePositionCorrection3 correction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradePositionCorrection3
	 * TradePositionCorrection3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice
	 * TradePositionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Crrctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Correction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the report is correcting the erroneous data fields of a previously submitted position."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePositionReport4Choice, TradePositionCorrection3> mmCorrection = new MMMessageAssociationEnd<TradePositionReport4Choice, TradePositionCorrection3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradePositionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "Crrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Correction";
			definition = "Indicates that the report is correcting the erroneous data fields of a previously submitted position.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradePositionCorrection3.mmObject();
		}

		@Override
		public TradePositionCorrection3 getValue(TradePositionReport4Choice obj) {
			return obj.getCorrection();
		}

		@Override
		public void setValue(TradePositionReport4Choice obj, TradePositionCorrection3 value) {
			obj.setCorrection(value);
		}
	};
	@XmlElement(name = "EarlyTermntn", required = true)
	protected TradePositionEarlyTermination3 earlyTermination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradePositionEarlyTermination3
	 * TradePositionEarlyTermination3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice
	 * TradePositionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyTermntn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyTermination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that reported position is an early termination of an existing contract."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePositionReport4Choice, TradePositionEarlyTermination3> mmEarlyTermination = new MMMessageAssociationEnd<TradePositionReport4Choice, TradePositionEarlyTermination3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradePositionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "EarlyTermntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyTermination";
			definition = "Indicates that reported position is an early termination of an existing contract.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradePositionEarlyTermination3.mmObject();
		}

		@Override
		public TradePositionEarlyTermination3 getValue(TradePositionReport4Choice obj) {
			return obj.getEarlyTermination();
		}

		@Override
		public void setValue(TradePositionReport4Choice obj, TradePositionEarlyTermination3 value) {
			obj.setEarlyTermination(value);
		}
	};
	@XmlElement(name = "ValtnUpd", required = true)
	protected TradePositionValuationUpdate3 valuationUpdate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradePositionValuationUpdate3
	 * TradePositionValuationUpdate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice
	 * TradePositionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnUpd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an update of a contract valuation or collateral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePositionReport4Choice, TradePositionValuationUpdate3> mmValuationUpdate = new MMMessageAssociationEnd<TradePositionReport4Choice, TradePositionValuationUpdate3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradePositionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "ValtnUpd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationUpdate";
			definition = "Indicates an update of a contract valuation or collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradePositionValuationUpdate3.mmObject();
		}

		@Override
		public TradePositionValuationUpdate3 getValue(TradePositionReport4Choice obj) {
			return obj.getValuationUpdate();
		}

		@Override
		public void setValue(TradePositionReport4Choice obj, TradePositionValuationUpdate3 value) {
			obj.setValuationUpdate(value);
		}
	};
	@XmlElement(name = "Err", required = true)
	protected TradePositionError3 error;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradePositionError3
	 * TradePositionError3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice
	 * TradePositionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Err"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Error"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a cancellation of a wrongly submitted entire report in case the contract never came into existence or was not subject to reporting requirements but was reported to a trade repository by mistake."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePositionReport4Choice, TradePositionError3> mmError = new MMMessageAssociationEnd<TradePositionReport4Choice, TradePositionError3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradePositionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "Err";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Error";
			definition = "Indicates a cancellation of a wrongly submitted entire report in case the contract never came into existence or was not subject to reporting requirements but was reported to a trade repository by mistake.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradePositionError3.mmObject();
		}

		@Override
		public TradePositionError3 getValue(TradePositionReport4Choice obj) {
			return obj.getError();
		}

		@Override
		public void setValue(TradePositionReport4Choice obj, TradePositionError3 value) {
			obj.setError(value);
		}
	};
	@XmlElement(name = "Othr", required = true)
	protected TradePositionOther3 other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradePositionOther3
	 * TradePositionOther3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradePositionReport4Choice
	 * TradePositionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates any other amendment to the terms or details of a previously reported position."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradePositionReport4Choice, TradePositionOther3> mmOther = new MMMessageAssociationEnd<TradePositionReport4Choice, TradePositionOther3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradePositionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Indicates any other amendment to the terms or details of a previously reported position.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradePositionOther3.mmObject();
		}

		@Override
		public TradePositionOther3 getValue(TradePositionReport4Choice obj) {
			return obj.getOther();
		}

		@Override
		public void setValue(TradePositionReport4Choice obj, TradePositionOther3 value) {
			obj.setOther(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.choice.TradePositionReport4Choice.mmNew, com.tools20022.repository.choice.TradePositionReport4Choice.mmModification,
								com.tools20022.repository.choice.TradePositionReport4Choice.mmCorrection, com.tools20022.repository.choice.TradePositionReport4Choice.mmEarlyTermination,
								com.tools20022.repository.choice.TradePositionReport4Choice.mmValuationUpdate, com.tools20022.repository.choice.TradePositionReport4Choice.mmError,
								com.tools20022.repository.choice.TradePositionReport4Choice.mmOther);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradePositionReport4Choice";
				definition = "Provides details on the relevant action types for trade positions.";
			}
		});
		return mmObject_lazy.get();
	}

	public TradeNewPosition3 getNew() {
		return new_;
	}

	public TradePositionReport4Choice setNew(TradeNewPosition3 new_) {
		this.new_ = Objects.requireNonNull(new_);
		return this;
	}

	public TradePositionModification3 getModification() {
		return modification;
	}

	public TradePositionReport4Choice setModification(TradePositionModification3 modification) {
		this.modification = Objects.requireNonNull(modification);
		return this;
	}

	public TradePositionCorrection3 getCorrection() {
		return correction;
	}

	public TradePositionReport4Choice setCorrection(TradePositionCorrection3 correction) {
		this.correction = Objects.requireNonNull(correction);
		return this;
	}

	public TradePositionEarlyTermination3 getEarlyTermination() {
		return earlyTermination;
	}

	public TradePositionReport4Choice setEarlyTermination(TradePositionEarlyTermination3 earlyTermination) {
		this.earlyTermination = Objects.requireNonNull(earlyTermination);
		return this;
	}

	public TradePositionValuationUpdate3 getValuationUpdate() {
		return valuationUpdate;
	}

	public TradePositionReport4Choice setValuationUpdate(TradePositionValuationUpdate3 valuationUpdate) {
		this.valuationUpdate = Objects.requireNonNull(valuationUpdate);
		return this;
	}

	public TradePositionError3 getError() {
		return error;
	}

	public TradePositionReport4Choice setError(TradePositionError3 error) {
		this.error = Objects.requireNonNull(error);
		return this;
	}

	public TradePositionOther3 getOther() {
		return other;
	}

	public TradePositionReport4Choice setOther(TradePositionOther3 other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}