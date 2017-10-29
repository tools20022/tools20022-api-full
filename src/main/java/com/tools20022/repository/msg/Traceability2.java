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
import com.tools20022.repository.datatype.ISODateTime;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of partners involved in exchange from the merchant to the
 * issuer, with the relative timestamp of their exchanges.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Traceability2#RelayIdentification
 * Traceability2.RelayIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Traceability2#TraceDateTimeIn
 * Traceability2.TraceDateTimeIn}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Traceability2#TraceDateTimeOut
 * Traceability2.TraceDateTimeOut}</li>
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
 * "Traceability2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Traceability3 Traceability3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Traceability4 Traceability4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Traceability5 Traceability5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Traceability1
 * Traceability1}</li>
 * </ul>
 */
public class Traceability2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of a partner of a message exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification76
	 * GenericIdentification76}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability2 Traceability2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RlayId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelayIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a partner of a message exchange."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Traceability3#RelayIdentification
	 * Traceability3.RelayIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Traceability4#RelayIdentification
	 * Traceability4.RelayIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Traceability5#RelayIdentification
	 * Traceability5.RelayIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Traceability1#RelayIdentification
	 * Traceability1.RelayIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd RelayIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> Traceability2.mmObject();
			isDerived = false;
			xmlTag = "RlayId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelayIdentification";
			definition = "Identification of a partner of a message exchange.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Traceability1.RelayIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Traceability3.RelayIdentification, com.tools20022.repository.msg.Traceability4.RelayIdentification,
					com.tools20022.repository.msg.Traceability5.RelayIdentification);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> GenericIdentification76.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Date and time of incoming data exchange for relaying or processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability2 Traceability2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TracDtTmIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraceDateTimeIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of incoming data exchange for relaying or processing."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Traceability3#TraceDateTimeIn
	 * Traceability3.TraceDateTimeIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Traceability4#TraceDateTimeIn
	 * Traceability4.TraceDateTimeIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Traceability5#TraceDateTimeIn
	 * Traceability5.TraceDateTimeIn}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Traceability1#TraceDateTimeIn
	 * Traceability1.TraceDateTimeIn}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TraceDateTimeIn = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Traceability2.mmObject();
			isDerived = false;
			xmlTag = "TracDtTmIn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraceDateTimeIn";
			definition = "Date and time of incoming data exchange for relaying or processing.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Traceability1.TraceDateTimeIn;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Traceability3.TraceDateTimeIn, com.tools20022.repository.msg.Traceability4.TraceDateTimeIn, com.tools20022.repository.msg.Traceability5.TraceDateTimeIn);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Date and time of the outgoing exchange for relaying or processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Traceability2 Traceability2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TracDtTmOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraceDateTimeOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the outgoing exchange for relaying or processing."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Traceability3#TraceDateTimeOut
	 * Traceability3.TraceDateTimeOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Traceability4#TraceDateTimeOut
	 * Traceability4.TraceDateTimeOut}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Traceability5#TraceDateTimeOut
	 * Traceability5.TraceDateTimeOut}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Traceability1#TraceDateTimeOut
	 * Traceability1.TraceDateTimeOut}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TraceDateTimeOut = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Traceability2.mmObject();
			isDerived = false;
			xmlTag = "TracDtTmOut";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraceDateTimeOut";
			definition = "Date and time of the outgoing exchange for relaying or processing.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.Traceability1.TraceDateTimeOut;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Traceability3.TraceDateTimeOut, com.tools20022.repository.msg.Traceability4.TraceDateTimeOut, com.tools20022.repository.msg.Traceability5.TraceDateTimeOut);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Traceability2.RelayIdentification, com.tools20022.repository.msg.Traceability2.TraceDateTimeIn,
						com.tools20022.repository.msg.Traceability2.TraceDateTimeOut);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Traceability2";
				definition = "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.";
				previousVersion_lazy = () -> Traceability1.mmObject();
				nextVersions_lazy = () -> Arrays.asList(Traceability3.mmObject(), Traceability4.mmObject(), Traceability5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}