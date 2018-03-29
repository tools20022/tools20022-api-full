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
import com.tools20022.repository.area.auth.FinancialInstrumentReportingTransactionReportV01;
import com.tools20022.repository.entity.SecuritiesTransaction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesTransactionReport2;
import com.tools20022.repository.msg.SecuritiesTransactionReport4;
import com.tools20022.repository.msg.SupplementaryData1;
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
 * Choice between a new or a cancellation transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReportingTransactionType1Choice#mmNew
 * ReportingTransactionType1Choice.mmNew}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReportingTransactionType1Choice#mmCancellation
 * ReportingTransactionType1Choice.mmCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReportingTransactionType1Choice#mmSupplementaryData
 * ReportingTransactionType1Choice.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.FinancialInstrumentReportingTransactionReportV01#mmTransaction
 * FinancialInstrumentReportingTransactionReportV01.mmTransaction}</li>
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
 * "ReportingTransactionType1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between a new or a cancellation transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReportingTransactionType1Choice", propOrder = {"new_", "cancellation", "supplementaryData"})
public class ReportingTransactionType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "New", required = true)
	protected SecuritiesTransactionReport4 new_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4
	 * SecuritiesTransactionReport4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransaction
	 * SecuritiesTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReportingTransactionType1Choice
	 * ReportingTransactionType1Choice}</li>
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
	 * definition} = "Transaction is a newly reported transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingTransactionType1Choice, SecuritiesTransactionReport4> mmNew = new MMMessageAssociationEnd<ReportingTransactionType1Choice, SecuritiesTransactionReport4>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTransaction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ReportingTransactionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "New";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "New";
			definition = "Transaction is a newly reported transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionReport4.mmObject();
		}

		@Override
		public SecuritiesTransactionReport4 getValue(ReportingTransactionType1Choice obj) {
			return obj.getNew();
		}

		@Override
		public void setValue(ReportingTransactionType1Choice obj, SecuritiesTransactionReport4 value) {
			obj.setNew(value);
		}
	};
	@XmlElement(name = "Cxl", required = true)
	protected SecuritiesTransactionReport2 cancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2
	 * SecuritiesTransactionReport2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransaction
	 * SecuritiesTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReportingTransactionType1Choice
	 * ReportingTransactionType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a cancellation transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingTransactionType1Choice, SecuritiesTransactionReport2> mmCancellation = new MMMessageAssociationEnd<ReportingTransactionType1Choice, SecuritiesTransactionReport2>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTransaction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ReportingTransactionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "Cxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancellation";
			definition = "Transaction is a cancellation transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesTransactionReport2.mmObject();
		}

		@Override
		public SecuritiesTransactionReport2 getValue(ReportingTransactionType1Choice obj) {
			return obj.getCancellation();
		}

		@Override
		public void setValue(ReportingTransactionType1Choice obj, SecuritiesTransactionReport2 value) {
			obj.setCancellation(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReportingTransactionType1Choice
	 * ReportingTransactionType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReportingTransactionType1Choice, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<ReportingTransactionType1Choice, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ReportingTransactionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ReportingTransactionType1Choice obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ReportingTransactionType1Choice obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReportingTransactionType1Choice.mmNew, com.tools20022.repository.choice.ReportingTransactionType1Choice.mmCancellation,
						com.tools20022.repository.choice.ReportingTransactionType1Choice.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstrumentReportingTransactionReportV01.mmTransaction);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingTransactionType1Choice";
				definition = "Choice between a new or a cancellation transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTransactionReport4 getNew() {
		return new_;
	}

	public ReportingTransactionType1Choice setNew(SecuritiesTransactionReport4 new_) {
		this.new_ = Objects.requireNonNull(new_);
		return this;
	}

	public SecuritiesTransactionReport2 getCancellation() {
		return cancellation;
	}

	public ReportingTransactionType1Choice setCancellation(SecuritiesTransactionReport2 cancellation) {
		this.cancellation = Objects.requireNonNull(cancellation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ReportingTransactionType1Choice setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}