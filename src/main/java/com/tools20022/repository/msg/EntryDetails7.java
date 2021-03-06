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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BatchInformation2;
import com.tools20022.repository.msg.EntryTransaction8;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the underlying transaction(s) and/or batched entries.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EntryDetails7#mmBatch
 * EntryDetails7.mmBatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EntryDetails7#mmTransactionDetails
 * EntryDetails7.mmTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EntryDetails7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the underlying transaction(s) and/or batched entries."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EntryDetails8 EntryDetails8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.EntryDetails6
 * EntryDetails6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EntryDetails7", propOrder = {"batch", "transactionDetails"})
public class EntryDetails7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Btch")
	protected BatchInformation2 batch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BatchInformation2
	 * BatchInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryDetails7 EntryDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Btch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Batch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on batched transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.EntryDetails8#mmBatch
	 * EntryDetails8.mmBatch}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryDetails6#mmBatch
	 * EntryDetails6.mmBatch}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryDetails7, Optional<BatchInformation2>> mmBatch = new MMMessageAssociationEnd<EntryDetails7, Optional<BatchInformation2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryDetails7.mmObject();
			isDerived = false;
			xmlTag = "Btch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Batch";
			definition = "Provides details on batched transactions.";
			nextVersions_lazy = () -> Arrays.asList(EntryDetails8.mmBatch);
			previousVersion_lazy = () -> EntryDetails6.mmBatch;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BatchInformation2.mmObject();
		}

		@Override
		public Optional<BatchInformation2> getValue(EntryDetails7 obj) {
			return obj.getBatch();
		}

		@Override
		public void setValue(EntryDetails7 obj, Optional<BatchInformation2> value) {
			obj.setBatch(value.orElse(null));
		}
	};
	@XmlElement(name = "TxDtls")
	protected List<EntryTransaction8> transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EntryTransaction8
	 * EntryTransaction8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EntryDetails7 EntryDetails7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information on the underlying transaction(s)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EntryDetails8#mmTransactionDetails
	 * EntryDetails8.mmTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.EntryDetails6#mmTransactionDetails
	 * EntryDetails6.mmTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EntryDetails7, List<EntryTransaction8>> mmTransactionDetails = new MMMessageAssociationEnd<EntryDetails7, List<EntryTransaction8>>() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EntryDetails7.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Provides information on the underlying transaction(s).";
			nextVersions_lazy = () -> Arrays.asList(EntryDetails8.mmTransactionDetails);
			previousVersion_lazy = () -> EntryDetails6.mmTransactionDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EntryTransaction8.mmObject();
		}

		@Override
		public List<EntryTransaction8> getValue(EntryDetails7 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(EntryDetails7 obj, List<EntryTransaction8> value) {
			obj.setTransactionDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EntryDetails7.mmBatch, com.tools20022.repository.msg.EntryDetails7.mmTransactionDetails);
				trace_lazy = () -> CashEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EntryDetails7";
				definition = "Identifies the underlying transaction(s) and/or batched entries.";
				nextVersions_lazy = () -> Arrays.asList(EntryDetails8.mmObject());
				previousVersion_lazy = () -> EntryDetails6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BatchInformation2> getBatch() {
		return batch == null ? Optional.empty() : Optional.of(batch);
	}

	public EntryDetails7 setBatch(BatchInformation2 batch) {
		this.batch = batch;
		return this;
	}

	public List<EntryTransaction8> getTransactionDetails() {
		return transactionDetails == null ? transactionDetails = new ArrayList<>() : transactionDetails;
	}

	public EntryDetails7 setTransactionDetails(List<EntryTransaction8> transactionDetails) {
		this.transactionDetails = Objects.requireNonNull(transactionDetails);
		return this;
	}
}