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
 * Provides details on the reported trade transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice#mmNew
 * TradeTransactionReport4Choice.mmNew}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice#mmModification
 * TradeTransactionReport4Choice.mmModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice#mmCorrection
 * TradeTransactionReport4Choice.mmCorrection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice#mmEarlyTermination
 * TradeTransactionReport4Choice.mmEarlyTermination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice#mmPositionComponent
 * TradeTransactionReport4Choice.mmPositionComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice#mmValuationUpdate
 * TradeTransactionReport4Choice.mmValuationUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice#mmCompression
 * TradeTransactionReport4Choice.mmCompression}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice#mmError
 * TradeTransactionReport4Choice.mmError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice#mmOther
 * TradeTransactionReport4Choice.mmOther}</li>
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
 * "TradeTransactionReport4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the reported trade transactions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeTransactionReport4Choice", propOrder = {"new_", "modification", "correction", "earlyTermination", "positionComponent", "valuationUpdate", "compression", "error", "other"})
public class TradeTransactionReport4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "New", required = true)
	protected TradeNewTransaction3 new_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeNewTransaction3
	 * TradeNewTransaction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice
	 * TradeTransactionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "New"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "New"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether transaction is reported for the first time."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNew = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeTransactionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "New";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "New";
			definition = "Indicates whether transaction is reported for the first time.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeNewTransaction3.mmObject();
		}
	};
	@XmlElement(name = "Mod", required = true)
	protected TradeTransactionModification3 modification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionModification3
	 * TradeTransactionModification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice
	 * TradeTransactionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Modification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a modification to the terms or details of a previously reported transaction, but not a correction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeTransactionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "Mod";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Modification";
			definition = "Indicates a modification to the terms or details of a previously reported transaction, but not a correction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeTransactionModification3.mmObject();
		}
	};
	@XmlElement(name = "Crrctn", required = true)
	protected TradeTransactionCorrection3 correction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionCorrection3
	 * TradeTransactionCorrection3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice
	 * TradeTransactionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Crrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Correction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the report is correcting the erroneous data fields of a previously submitted report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorrection = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeTransactionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "Crrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Correction";
			definition = "Indicates that the report is correcting the erroneous data fields of a previously submitted report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeTransactionCorrection3.mmObject();
		}
	};
	@XmlElement(name = "EarlyTermntn", required = true)
	protected TradeTransactionEarlyTermination3 earlyTermination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionEarlyTermination3
	 * TradeTransactionEarlyTermination3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice
	 * TradeTransactionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyTermntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyTermination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that reported transaction is an early termination of an existing contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarlyTermination = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeTransactionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "EarlyTermntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyTermination";
			definition = "Indicates that reported transaction is an early termination of an existing contract.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeTransactionEarlyTermination3.mmObject();
		}
	};
	@XmlElement(name = "PosCmpnt", required = true)
	protected TradePositionComponent3 positionComponent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradePositionComponent3
	 * TradePositionComponent3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice
	 * TradeTransactionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PosCmpnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a derivative contract that is to be reported as a new trade and also included in a separate position report on the same day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPositionComponent = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeTransactionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "PosCmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionComponent";
			definition = "Indicates a derivative contract that is to be reported as a new trade and also included in a separate position report on the same day.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradePositionComponent3.mmObject();
		}
	};
	@XmlElement(name = "ValtnUpd", required = true)
	protected TradeTransactionValuationUpdate3 valuationUpdate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionValuationUpdate3
	 * TradeTransactionValuationUpdate3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice
	 * TradeTransactionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnUpd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates an update of a contract valuation or collateral."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmValuationUpdate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeTransactionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "ValtnUpd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationUpdate";
			definition = "Indicates an update of a contract valuation or collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeTransactionValuationUpdate3.mmObject();
		}
	};
	@XmlElement(name = "Cmprssn", required = true)
	protected TradeTransactionCompression3 compression;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionCompression3
	 * TradeTransactionCompression3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice
	 * TradeTransactionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmprssn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Compression"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates a compression of the reported contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCompression = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeTransactionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "Cmprssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Compression";
			definition = "Indicates a compression of the reported contract.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeTransactionCompression3.mmObject();
		}
	};
	@XmlElement(name = "Err", required = true)
	protected TradeTransactionError3 error;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeTransactionError3
	 * TradeTransactionError3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice
	 * TradeTransactionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Err"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Error"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a cancellation of a wrongly submitted entire report in case the contract never came into existence or was not subject to reporting requirements but was reported to a trade repository by mistake."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeTransactionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "Err";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Error";
			definition = "Indicates a cancellation of a wrongly submitted entire report in case the contract never came into existence or was not subject to reporting requirements but was reported to a trade repository by mistake.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeTransactionError3.mmObject();
		}
	};
	@XmlElement(name = "Othr", required = true)
	protected TradeTransactionOther4 other;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeTransactionOther4
	 * TradeTransactionOther4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TradeTransactionReport4Choice
	 * TradeTransactionReport4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Othr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates any other amendment to the contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOther = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.TradeTransactionReport4Choice.mmObject();
			isDerived = false;
			xmlTag = "Othr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Indicates any other amendment to the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeTransactionOther4.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TradeTransactionReport4Choice.mmNew, com.tools20022.repository.choice.TradeTransactionReport4Choice.mmModification,
						com.tools20022.repository.choice.TradeTransactionReport4Choice.mmCorrection, com.tools20022.repository.choice.TradeTransactionReport4Choice.mmEarlyTermination,
						com.tools20022.repository.choice.TradeTransactionReport4Choice.mmPositionComponent, com.tools20022.repository.choice.TradeTransactionReport4Choice.mmValuationUpdate,
						com.tools20022.repository.choice.TradeTransactionReport4Choice.mmCompression, com.tools20022.repository.choice.TradeTransactionReport4Choice.mmError,
						com.tools20022.repository.choice.TradeTransactionReport4Choice.mmOther);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeTransactionReport4Choice";
				definition = "Provides details on the reported trade transactions.";
			}
		});
		return mmObject_lazy.get();
	}

	public TradeNewTransaction3 getNew() {
		return new_;
	}

	public TradeTransactionReport4Choice setNew(TradeNewTransaction3 new_) {
		this.new_ = Objects.requireNonNull(new_);
		return this;
	}

	public TradeTransactionModification3 getModification() {
		return modification;
	}

	public TradeTransactionReport4Choice setModification(TradeTransactionModification3 modification) {
		this.modification = Objects.requireNonNull(modification);
		return this;
	}

	public TradeTransactionCorrection3 getCorrection() {
		return correction;
	}

	public TradeTransactionReport4Choice setCorrection(TradeTransactionCorrection3 correction) {
		this.correction = Objects.requireNonNull(correction);
		return this;
	}

	public TradeTransactionEarlyTermination3 getEarlyTermination() {
		return earlyTermination;
	}

	public TradeTransactionReport4Choice setEarlyTermination(TradeTransactionEarlyTermination3 earlyTermination) {
		this.earlyTermination = Objects.requireNonNull(earlyTermination);
		return this;
	}

	public TradePositionComponent3 getPositionComponent() {
		return positionComponent;
	}

	public TradeTransactionReport4Choice setPositionComponent(TradePositionComponent3 positionComponent) {
		this.positionComponent = Objects.requireNonNull(positionComponent);
		return this;
	}

	public TradeTransactionValuationUpdate3 getValuationUpdate() {
		return valuationUpdate;
	}

	public TradeTransactionReport4Choice setValuationUpdate(TradeTransactionValuationUpdate3 valuationUpdate) {
		this.valuationUpdate = Objects.requireNonNull(valuationUpdate);
		return this;
	}

	public TradeTransactionCompression3 getCompression() {
		return compression;
	}

	public TradeTransactionReport4Choice setCompression(TradeTransactionCompression3 compression) {
		this.compression = Objects.requireNonNull(compression);
		return this;
	}

	public TradeTransactionError3 getError() {
		return error;
	}

	public TradeTransactionReport4Choice setError(TradeTransactionError3 error) {
		this.error = Objects.requireNonNull(error);
		return this;
	}

	public TradeTransactionOther4 getOther() {
		return other;
	}

	public TradeTransactionReport4Choice setOther(TradeTransactionOther4 other) {
		this.other = Objects.requireNonNull(other);
		return this;
	}
}