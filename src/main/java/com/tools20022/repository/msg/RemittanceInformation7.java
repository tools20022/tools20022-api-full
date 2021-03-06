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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.StructuredRemittanceInformation9;
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
 * Information supplied to enable the matching/reconciliation of an entry with
 * the items that the payment is intended to settle, such as commercial invoices
 * in an accounts' receivable system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation7#mmUnstructured
 * RemittanceInformation7.mmUnstructured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceInformation7#mmStructured
 * RemittanceInformation7.mmStructured}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RemittanceInformation7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation8
 * RemittanceInformation8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation10
 * RemittanceInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceInformation14
 * RemittanceInformation14}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RemittanceInformation7", propOrder = {"unstructured", "structured"})
public class RemittanceInformation7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ustrd")
	protected List<Max140Text> unstructured;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation7
	 * RemittanceInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ustrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unstructured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation8#mmUnstructured
	 * RemittanceInformation8.mmUnstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation10#mmUnstructured
	 * RemittanceInformation10.mmUnstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation14#mmUnstructured
	 * RemittanceInformation14.mmUnstructured}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RemittanceInformation7, List<Max140Text>> mmUnstructured = new MMMessageAttribute<RemittanceInformation7, List<Max140Text>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RemittanceInformation7.mmObject();
			isDerived = false;
			xmlTag = "Ustrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unstructured";
			definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.";
			nextVersions_lazy = () -> Arrays.asList(RemittanceInformation8.mmUnstructured, RemittanceInformation10.mmUnstructured, RemittanceInformation14.mmUnstructured);
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public List<Max140Text> getValue(RemittanceInformation7 obj) {
			return obj.getUnstructured();
		}

		@Override
		public void setValue(RemittanceInformation7 obj, List<Max140Text> value) {
			obj.setUnstructured(value);
		}
	};
	@XmlElement(name = "Strd")
	protected List<StructuredRemittanceInformation9> structured;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9
	 * StructuredRemittanceInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation7
	 * RemittanceInformation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Strd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Structured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation8#mmStructured
	 * RemittanceInformation8.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation10#mmStructured
	 * RemittanceInformation10.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceInformation14#mmStructured
	 * RemittanceInformation14.mmStructured}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RemittanceInformation7, List<StructuredRemittanceInformation9>> mmStructured = new MMMessageAssociationEnd<RemittanceInformation7, List<StructuredRemittanceInformation9>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RemittanceInformation7.mmObject();
			isDerived = false;
			xmlTag = "Strd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Structured";
			definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.";
			nextVersions_lazy = () -> Arrays.asList(RemittanceInformation8.mmStructured, RemittanceInformation10.mmStructured, RemittanceInformation14.mmStructured);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StructuredRemittanceInformation9.mmObject();
		}

		@Override
		public List<StructuredRemittanceInformation9> getValue(RemittanceInformation7 obj) {
			return obj.getStructured();
		}

		@Override
		public void setValue(RemittanceInformation7 obj, List<StructuredRemittanceInformation9> value) {
			obj.setStructured(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceInformation7.mmUnstructured, com.tools20022.repository.msg.RemittanceInformation7.mmStructured);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceInformation7";
				definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system.";
				nextVersions_lazy = () -> Arrays.asList(RemittanceInformation8.mmObject(), RemittanceInformation10.mmObject(), RemittanceInformation14.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max140Text> getUnstructured() {
		return unstructured == null ? unstructured = new ArrayList<>() : unstructured;
	}

	public RemittanceInformation7 setUnstructured(List<Max140Text> unstructured) {
		this.unstructured = Objects.requireNonNull(unstructured);
		return this;
	}

	public List<StructuredRemittanceInformation9> getStructured() {
		return structured == null ? structured = new ArrayList<>() : structured;
	}

	public RemittanceInformation7 setStructured(List<StructuredRemittanceInformation9> structured) {
		this.structured = Objects.requireNonNull(structured);
		return this;
	}
}