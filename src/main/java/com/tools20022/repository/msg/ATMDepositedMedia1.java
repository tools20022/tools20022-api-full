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
import com.tools20022.repository.codeset.ATMMediaType2Code;
import com.tools20022.repository.codeset.ATMMediaType3Code;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMDepositedMedia1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Deposited media put in the safe."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMDepositedMedia3
 * ATMDepositedMedia3}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ATMDepositedMedia1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number accountSequenceNumber;
	/**
	 * Link to the account for multi-account deposit.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Link to the account for multi-account deposit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMDepositedMedia1.mmObject();
			isDerived = false;
			xmlTag = "AcctSeqNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSequenceNumber";
			definition = "Link to the account for multi-account deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ATMMediaType2Code mediaType;
	/**
	 * Type of deposited media.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediaType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of deposited media."</li>
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
	public static final MMMessageAttribute mmMediaType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMDepositedMedia1.mmObject();
			isDerived = false;
			xmlTag = "MdiaTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaType";
			definition = "Type of deposited media.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMDepositedMedia3.mmMediaType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMMediaType2Code.mmObject();
		}
	};
	protected ATMMediaType3Code mediaCategory;
	/**
	 * Category of deposited media items.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediaCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of deposited media items."</li>
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
	public static final MMMessageAttribute mmMediaCategory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMDepositedMedia1.mmObject();
			isDerived = false;
			xmlTag = "MdiaCtgy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaCategory";
			definition = "Category of deposited media items.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMDepositedMedia3.mmMediaCategory);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMMediaType3Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMDepositedMedia2> mediaItems;
	/**
	 * Media item that are deposited.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MediaItems"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Media item that are deposited."</li>
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
	public static final MMMessageAssociationEnd mmMediaItems = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMDepositedMedia1.mmObject();
			isDerived = false;
			xmlTag = "MdiaItms";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MediaItems";
			definition = "Media item that are deposited.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMDepositedMedia3.mmMediaItems);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMDepositedMedia1.mmAccountSequenceNumber, com.tools20022.repository.msg.ATMDepositedMedia1.mmMediaType,
						com.tools20022.repository.msg.ATMDepositedMedia1.mmMediaCategory, com.tools20022.repository.msg.ATMDepositedMedia1.mmMediaItems);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMDepositedMedia1";
				definition = "Deposited media put in the safe.";
				nextVersions_lazy = () -> Arrays.asList(ATMDepositedMedia3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Number getAccountSequenceNumber() {
		return accountSequenceNumber;
	}

	public void setAccountSequenceNumber(Number accountSequenceNumber) {
		this.accountSequenceNumber = accountSequenceNumber;
	}

	public ATMMediaType2Code getMediaType() {
		return mediaType;
	}

	public void setMediaType(ATMMediaType2Code mediaType) {
		this.mediaType = mediaType;
	}

	public ATMMediaType3Code getMediaCategory() {
		return mediaCategory;
	}

	public void setMediaCategory(ATMMediaType3Code mediaCategory) {
		this.mediaCategory = mediaCategory;
	}

	public List<ATMDepositedMedia2> getMediaItems() {
		return mediaItems;
	}

	public void setMediaItems(List<com.tools20022.repository.msg.ATMDepositedMedia2> mediaItems) {
		this.mediaItems = mediaItems;
	}
}