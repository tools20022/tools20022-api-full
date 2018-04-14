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
import com.tools20022.repository.codeset.ATMMediaType2Code;
import com.tools20022.repository.codeset.ATMMediaType3Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMDepositedMedia2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Deposited media put in the safe.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia1#mmAccountSequenceNumber
 * ATMDepositedMedia1.mmAccountSequenceNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMDepositedMedia1#mmMediaType
 * ATMDepositedMedia1.mmMediaType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia1#mmMediaCategory
 * ATMDepositedMedia1.mmMediaCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia1#mmMediaItems
 * ATMDepositedMedia1.mmMediaItems}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMDepositedMedia1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Deposited media put in the safe."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMDepositedMedia3
 * ATMDepositedMedia3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDepositedMedia1", propOrder = {"accountSequenceNumber", "mediaType", "mediaCategory", "mediaItems"})
public class ATMDepositedMedia1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctSeqNb")
	protected Number accountSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia1
	 * ATMDepositedMedia1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Link to the account for multi-account deposit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMDepositedMedia1, Optional<Number>> mmAccountSequenceNumber = new MMMessageAttribute<ATMDepositedMedia1, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia1.mmObject();
			isDerived = false;
			xmlTag = "AcctSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSequenceNumber";
			definition = "Link to the account for multi-account deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(ATMDepositedMedia1 obj) {
			return obj.getAccountSequenceNumber();
		}

		@Override
		public void setValue(ATMDepositedMedia1 obj, Optional<Number> value) {
			obj.setAccountSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "MdiaTp", required = true)
	protected ATMMediaType2Code mediaType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType2Code
	 * ATMMediaType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia1
	 * ATMDepositedMedia1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MdiaTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediaType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of deposited media."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia3#mmMediaType
	 * ATMDepositedMedia3.mmMediaType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMDepositedMedia1, ATMMediaType2Code> mmMediaType = new MMMessageAttribute<ATMDepositedMedia1, ATMMediaType2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia1.mmObject();
			isDerived = false;
			xmlTag = "MdiaTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaType";
			definition = "Type of deposited media.";
			nextVersions_lazy = () -> Arrays.asList(ATMDepositedMedia3.mmMediaType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMMediaType2Code.mmObject();
		}

		@Override
		public ATMMediaType2Code getValue(ATMDepositedMedia1 obj) {
			return obj.getMediaType();
		}

		@Override
		public void setValue(ATMDepositedMedia1 obj, ATMMediaType2Code value) {
			obj.setMediaType(value);
		}
	};
	@XmlElement(name = "MdiaCtgy")
	protected ATMMediaType3Code mediaCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMMediaType3Code
	 * ATMMediaType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia1
	 * ATMDepositedMedia1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MdiaCtgy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediaCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of deposited media items."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia3#mmMediaCategory
	 * ATMDepositedMedia3.mmMediaCategory}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMDepositedMedia1, Optional<ATMMediaType3Code>> mmMediaCategory = new MMMessageAttribute<ATMDepositedMedia1, Optional<ATMMediaType3Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia1.mmObject();
			isDerived = false;
			xmlTag = "MdiaCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaCategory";
			definition = "Category of deposited media items.";
			nextVersions_lazy = () -> Arrays.asList(ATMDepositedMedia3.mmMediaCategory);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMMediaType3Code.mmObject();
		}

		@Override
		public Optional<ATMMediaType3Code> getValue(ATMDepositedMedia1 obj) {
			return obj.getMediaCategory();
		}

		@Override
		public void setValue(ATMDepositedMedia1 obj, Optional<ATMMediaType3Code> value) {
			obj.setMediaCategory(value.orElse(null));
		}
	};
	@XmlElement(name = "MdiaItms", required = true)
	protected List<ATMDepositedMedia2> mediaItems;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMDepositedMedia2
	 * ATMDepositedMedia2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia1
	 * ATMDepositedMedia1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MdiaItms"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediaItems"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Media item that are deposited."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMDepositedMedia3#mmMediaItems
	 * ATMDepositedMedia3.mmMediaItems}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDepositedMedia1, List<ATMDepositedMedia2>> mmMediaItems = new MMMessageAssociationEnd<ATMDepositedMedia1, List<ATMDepositedMedia2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia1.mmObject();
			isDerived = false;
			xmlTag = "MdiaItms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaItems";
			definition = "Media item that are deposited.";
			nextVersions_lazy = () -> Arrays.asList(ATMDepositedMedia3.mmMediaItems);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMDepositedMedia2.mmObject();
		}

		@Override
		public List<ATMDepositedMedia2> getValue(ATMDepositedMedia1 obj) {
			return obj.getMediaItems();
		}

		@Override
		public void setValue(ATMDepositedMedia1 obj, List<ATMDepositedMedia2> value) {
			obj.setMediaItems(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMDepositedMedia1.mmAccountSequenceNumber, com.tools20022.repository.msg.ATMDepositedMedia1.mmMediaType,
						com.tools20022.repository.msg.ATMDepositedMedia1.mmMediaCategory, com.tools20022.repository.msg.ATMDepositedMedia1.mmMediaItems);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDepositedMedia1";
				definition = "Deposited media put in the safe.";
				nextVersions_lazy = () -> Arrays.asList(ATMDepositedMedia3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getAccountSequenceNumber() {
		return accountSequenceNumber == null ? Optional.empty() : Optional.of(accountSequenceNumber);
	}

	public ATMDepositedMedia1 setAccountSequenceNumber(Number accountSequenceNumber) {
		this.accountSequenceNumber = accountSequenceNumber;
		return this;
	}

	public ATMMediaType2Code getMediaType() {
		return mediaType;
	}

	public ATMDepositedMedia1 setMediaType(ATMMediaType2Code mediaType) {
		this.mediaType = Objects.requireNonNull(mediaType);
		return this;
	}

	public Optional<ATMMediaType3Code> getMediaCategory() {
		return mediaCategory == null ? Optional.empty() : Optional.of(mediaCategory);
	}

	public ATMDepositedMedia1 setMediaCategory(ATMMediaType3Code mediaCategory) {
		this.mediaCategory = mediaCategory;
		return this;
	}

	public List<ATMDepositedMedia2> getMediaItems() {
		return mediaItems == null ? mediaItems = new ArrayList<>() : mediaItems;
	}

	public ATMDepositedMedia1 setMediaItems(List<ATMDepositedMedia2> mediaItems) {
		this.mediaItems = Objects.requireNonNull(mediaItems);
		return this;
	}
}