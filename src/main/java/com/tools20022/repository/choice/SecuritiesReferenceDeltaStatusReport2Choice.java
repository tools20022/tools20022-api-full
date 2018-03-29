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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataDeltaReportV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesReferenceDataReport5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice defining financial instruments that are either new or have been
 * modified.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice#mmModifiedRecord
 * SecuritiesReferenceDeltaStatusReport2Choice.mmModifiedRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice#mmNewRecord
 * SecuritiesReferenceDeltaStatusReport2Choice.mmNewRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice#mmTerminatedRecord
 * SecuritiesReferenceDeltaStatusReport2Choice.mmTerminatedRecord}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingReferenceDataDeltaReportV01#mmFinancialInstrument
 * FinancialInstrumentReportingReferenceDataDeltaReportV01.mmFinancialInstrument
 * }</li>
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
 * "SecuritiesReferenceDeltaStatusReport2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice defining financial instruments that are either new or have been modified."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesReferenceDeltaStatusReport2Choice", propOrder = {"modifiedRecord", "newRecord", "terminatedRecord"})
public class SecuritiesReferenceDeltaStatusReport2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ModfdRcrd", required = true)
	protected SecuritiesReferenceDataReport5 modifiedRecord;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice
	 * SecuritiesReferenceDeltaStatusReport2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdRcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedRecord"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies data that has been modified since the previous report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesReferenceDeltaStatusReport2Choice, SecuritiesReferenceDataReport5> mmModifiedRecord = new MMMessageAssociationEnd<SecuritiesReferenceDeltaStatusReport2Choice, SecuritiesReferenceDataReport5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice.mmObject();
			isDerived = false;
			xmlTag = "ModfdRcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedRecord";
			definition = "Specifies data that has been modified since the previous report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesReferenceDataReport5.mmObject();
		}

		@Override
		public SecuritiesReferenceDataReport5 getValue(SecuritiesReferenceDeltaStatusReport2Choice obj) {
			return obj.getModifiedRecord();
		}

		@Override
		public void setValue(SecuritiesReferenceDeltaStatusReport2Choice obj, SecuritiesReferenceDataReport5 value) {
			obj.setModifiedRecord(value);
		}
	};
	@XmlElement(name = "NewRcrd", required = true)
	protected SecuritiesReferenceDataReport5 newRecord;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice
	 * SecuritiesReferenceDeltaStatusReport2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewRcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewRecord"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies new instruments that have been added since the previous report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesReferenceDeltaStatusReport2Choice, SecuritiesReferenceDataReport5> mmNewRecord = new MMMessageAssociationEnd<SecuritiesReferenceDeltaStatusReport2Choice, SecuritiesReferenceDataReport5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice.mmObject();
			isDerived = false;
			xmlTag = "NewRcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewRecord";
			definition = "Specifies new instruments that have been added since the previous report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesReferenceDataReport5.mmObject();
		}

		@Override
		public SecuritiesReferenceDataReport5 getValue(SecuritiesReferenceDeltaStatusReport2Choice obj) {
			return obj.getNewRecord();
		}

		@Override
		public void setValue(SecuritiesReferenceDeltaStatusReport2Choice obj, SecuritiesReferenceDataReport5 value) {
			obj.setNewRecord(value);
		}
	};
	@XmlElement(name = "TermntdRcrd", required = true)
	protected SecuritiesReferenceDataReport5 terminatedRecord;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesReferenceDataReport5
	 * SecuritiesReferenceDataReport5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice
	 * SecuritiesReferenceDeltaStatusReport2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntdRcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminatedRecord"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies instruments which have been terminated / have reached there pre-set termination data and are no longer valid instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesReferenceDeltaStatusReport2Choice, SecuritiesReferenceDataReport5> mmTerminatedRecord = new MMMessageAssociationEnd<SecuritiesReferenceDeltaStatusReport2Choice, SecuritiesReferenceDataReport5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice.mmObject();
			isDerived = false;
			xmlTag = "TermntdRcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminatedRecord";
			definition = "Specifies instruments which have been terminated / have reached there pre-set termination data and are no longer valid instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesReferenceDataReport5.mmObject();
		}

		@Override
		public SecuritiesReferenceDataReport5 getValue(SecuritiesReferenceDeltaStatusReport2Choice obj) {
			return obj.getTerminatedRecord();
		}

		@Override
		public void setValue(SecuritiesReferenceDeltaStatusReport2Choice obj, SecuritiesReferenceDataReport5 value) {
			obj.setTerminatedRecord(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice.mmModifiedRecord,
						com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice.mmNewRecord, com.tools20022.repository.choice.SecuritiesReferenceDeltaStatusReport2Choice.mmTerminatedRecord);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingReferenceDataDeltaReportV01.mmFinancialInstrument);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesReferenceDeltaStatusReport2Choice";
				definition = "Choice defining financial instruments that are either new or have been modified.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesReferenceDataReport5 getModifiedRecord() {
		return modifiedRecord;
	}

	public SecuritiesReferenceDeltaStatusReport2Choice setModifiedRecord(SecuritiesReferenceDataReport5 modifiedRecord) {
		this.modifiedRecord = Objects.requireNonNull(modifiedRecord);
		return this;
	}

	public SecuritiesReferenceDataReport5 getNewRecord() {
		return newRecord;
	}

	public SecuritiesReferenceDeltaStatusReport2Choice setNewRecord(SecuritiesReferenceDataReport5 newRecord) {
		this.newRecord = Objects.requireNonNull(newRecord);
		return this;
	}

	public SecuritiesReferenceDataReport5 getTerminatedRecord() {
		return terminatedRecord;
	}

	public SecuritiesReferenceDeltaStatusReport2Choice setTerminatedRecord(SecuritiesReferenceDataReport5 terminatedRecord) {
		this.terminatedRecord = Objects.requireNonNull(terminatedRecord);
		return this;
	}
}