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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Specifies the official date and identification of the event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionEventRegistration"
 * src="doc-files/CorporateActionEventRegistration.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmOfficialCorporateActionEventIdentification
 * CorporateActionEventRegistration.mmOfficialCorporateActionEventIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmOfficialAnnouncementPublicationDate
 * CorporateActionEventRegistration.mmOfficialAnnouncementPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEvent
 * CorporateActionEventRegistration.mmCorporateActionEvent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionEventRegistration
 * CorporateActionEvent.mmCorporateActionEventRegistration}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference1Choice
 * CorporateActionEventReference1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventReference1
 * CorporateActionEventReference1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference2Choice
 * CorporateActionEventReference2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventReference2
 * CorporateActionEventReference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventReference3
 * CorporateActionEventReference3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference3Choice
 * CorporateActionEventReference3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionEventReference4
 * CorporateActionEventReference4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference4Choice
 * CorporateActionEventReference4Choice}</li>
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
 * "CorporateActionEventRegistration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the official date and identification of the event."</li>
 * </ul>
 */
public class CorporateActionEventRegistration {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text corporateActionEventIdentification;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters6#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters6.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters5#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters5.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters7#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters7.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters8#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters8.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation8#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation8.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation20#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation20.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation25#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation25.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation32.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation35#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation35.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation43#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation43.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation53#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation53.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation56#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation56.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation57#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation57.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation9#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation9.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation13#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation13.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation34#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation34.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation42#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation42.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation52.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation58#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation58.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference1Choice#mmLinkedCorporateActionIdentification
	 * CorporateActionEventReference1Choice.
	 * mmLinkedCorporateActionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference1#mmEventIdentification
	 * CorporateActionEventReference1.mmEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation6#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation6.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference2Choice#mmLinkedCorporateActionIdentification
	 * CorporateActionEventReference2Choice.
	 * mmLinkedCorporateActionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference2#mmEventIdentification
	 * CorporateActionEventReference2.mmEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation15#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation15.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation21#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation21.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation28#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation28.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation36#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation36.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation44#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation44.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation55#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation55.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation61#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation61.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation7#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation7.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation26#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation26.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation33#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation33.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation27#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation27.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation41#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation41.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation49#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation49.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation68#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation68.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation1#mmCorporateActionEventIdentification
	 * EventInformation1.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation2#mmCorporateActionEventIdentification
	 * EventInformation2.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation3#mmCorporateActionEventIdentification
	 * EventInformation3.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation4#mmCorporateActionEventIdentification
	 * EventInformation4.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation5#mmCorporateActionEventIdentification
	 * EventInformation5.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation6#mmCorporateActionEventIdentification
	 * EventInformation6.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation4#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation4.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation16#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation16.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation24#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation24.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation29#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation29.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation39.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation47.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation50.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation62.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation3.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation17.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation23.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation30.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation38.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation46.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation54.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation64.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation63#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation63.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation11.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation19.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation22.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation31.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation37.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation45.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation51.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation67.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#mmCorporateActionEventIdentification
	 * AdditionalParameters3.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#mmCorporateActionEventIdentification
	 * AdditionalParameters7.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#mmCorporateActionEventIdentification
	 * AdditionalParameters8.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#mmCorporateActionEventIdentification
	 * AdditionalParameters9.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#mmCorporateActionEventIdentification
	 * AdditionalParameters10.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#mmCorporateActionEventIdentification
	 * AdditionalParameters11.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#mmCorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters3.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#mmCorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters6.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#mmCorporateActionEventIdentification
	 * SettlementTypeAndIdentification1.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#mmCorporateActionEventIdentification
	 * SettlementTypeAndIdentification8.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#mmCorporateActionEventIdentification
	 * SettlementTypeAndIdentification9.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#mmCorporateActionEventIdentification
	 * SettlementTypeAndIdentification11.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#mmCorporateActionEventIdentification
	 * SettlementTypeAndIdentification15.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#mmCorporateActionEventIdentification
	 * SettlementTypeAndIdentification17.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#mmCorporateActionEventIdentification
	 * SettlementTypeAndIdentification10.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#mmCorporateActionEventIdentification
	 * SettlementTypeAndIdentification12.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters1#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters1.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters4#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters4.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters9#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters9.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters10#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters10.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmCorporateActionEventIdentification
	 * TransactionDetails5.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmCorporateActionEventIdentification
	 * TransactionDetails9.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmCorporateActionEventIdentification
	 * TransactionDetails22.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmCorporateActionEventIdentification
	 * TransactionDetails23.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmCorporateActionEventIdentification
	 * TransactionDetails36.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmCorporateActionEventIdentification
	 * TransactionDetails47.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmCorporateActionEventIdentification
	 * TransactionDetails53.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmCorporateActionEventIdentification
	 * TransactionDetails58.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#mmCorporateActionEventIdentification
	 * Transaction7.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#mmCorporateActionEventIdentification
	 * Transaction8.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#mmCorporateActionEventIdentification
	 * Transaction9.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#mmCorporateActionEventIdentification
	 * Transaction10.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#mmCorporateActionEventIdentification
	 * Transaction14.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#mmCorporateActionEventIdentification
	 * Transaction12.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#mmCorporateActionEventIdentification
	 * Transaction15.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#mmCorporateActionEventIdentification
	 * Transaction16.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#mmCorporateActionEventIdentification
	 * Transaction20.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#mmCorporateActionEventIdentification
	 * Transaction19.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#mmCorporateActionEventIdentification
	 * Transaction23.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#mmCorporateActionEventIdentification
	 * Transaction22.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#mmCorporateActionEventIdentification
	 * Transaction28.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmCorporateActionEventIdentification
	 * Transaction27.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#mmCorporateActionEventIdentification
	 * Transaction30.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmCorporateActionEventIdentification
	 * Transaction31.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#mmCorporateActionEventIdentification
	 * Transaction6.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#mmCorporateActionEventIdentification
	 * Transaction11.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#mmCorporateActionEventIdentification
	 * Transaction13.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#mmCorporateActionEventIdentification
	 * Transaction17.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#mmCorporateActionEventIdentification
	 * Transaction18.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#mmCorporateActionEventIdentification
	 * Transaction21.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#mmCorporateActionEventIdentification
	 * Transaction29.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#mmCorporateActionEventIdentification
	 * Transaction32.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#mmCorporateActionEventIdentification
	 * Identification2.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction9#mmEventIdentification
	 * CorporateAction9.mmEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmIssuerCorporateActionIdentification
	 * CorporateActionInformation2.mmIssuerCorporateActionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation2#mmCorporateActionProcessingIdentification
	 * CorporateActionInformation2.mmCorporateActionProcessingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmIssuerCorporateActionIdentification
	 * CorporateActionInformation1.mmIssuerCorporateActionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1#mmCorporateActionProcessingIdentification
	 * CorporateActionInformation1.mmCorporateActionProcessingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails2.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails8.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmCorporateActionEventIdentification
	 * Identification7.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmCorporateActionEventIdentification
	 * Identification6.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation10#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation10.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation18#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation18.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation40#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation40.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation48#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation48.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails6.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails10.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails17.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails18.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#mmCorporateActionEventIdentification
	 * Identification5.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmCorporateActionEventIdentification
	 * Identification8.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmCorporateActionEventIdentification
	 * Identification11.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmCorporateActionEventIdentification
	 * Identification13.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmCorporateActionEventIdentification
	 * Identification9.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation14#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation14.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#mmCorporateActionEventIdentification
	 * IntraBalanceMovement1.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#mmCorporateActionEventIdentification
	 * Transaction25.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References36Choice#mmCorporateActionEventIdentification
	 * References36Choice.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#mmCorporateActionEventIdentification
	 * References35Choice.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation12#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation12.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation5#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation5.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#mmCorporateActionEventIdentification
	 * Identification3.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#mmCorporateActionEventIdentification
	 * AdditionalParameters16.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmCorporateActionEventIdentification
	 * TransactionDetails61.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmCorporateActionEventIdentification
	 * Transaction34.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails21.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#mmCorporateActionEventIdentification
	 * Transaction35.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#mmCorporateActionEventIdentification
	 * Transaction36.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation71#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation71.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation69.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation70.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation78.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation77#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation77.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation76.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails22.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmCorporateActionEventIdentification
	 * Transaction38.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmCorporateActionEventIdentification
	 * TransactionDetails66.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#mmCorporateActionEventIdentification
	 * Transaction39.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#mmCorporateActionEventIdentification
	 * Transaction37.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails24.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmCorporateActionEventIdentification
	 * Transaction41.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmCorporateActionEventIdentification
	 * TransactionDetails70.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#mmCorporateActionEventIdentification
	 * Transaction40.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation79.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation83.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation82.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmCorporateActionEventIdentification
	 * Transaction43.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmCorporateActionEventIdentification
	 * TransactionDetails71.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails25.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#mmCorporateActionEventIdentification
	 * Transaction42.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmCorporateActionEventIdentification
	 * Transaction47.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails26.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmCorporateActionEventIdentification
	 * TransactionDetails79.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#mmCorporateActionEventIdentification
	 * Transaction45.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#mmCorporateActionEventIdentification
	 * Transaction46.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmCorporateActionEventIdentification
	 * SettlementTypeAndIdentification19.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#mmCorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters10.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters11#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters11.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmCorporateActionEventIdentification
	 * AdditionalParameters21.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters14#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters14.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmCorporateActionEventIdentification
	 * Identification15.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters13#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters13.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation92#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation92.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference3#mmEventIdentification
	 * CorporateActionEventReference3.mmEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation89.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation88#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation88.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation86#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation86.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation91.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation87#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation87.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation84.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation85.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation90#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation90.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference3Choice#mmLinkedCorporateActionIdentification
	 * CorporateActionEventReference3Choice.
	 * mmLinkedCorporateActionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation7#mmCorporateActionEventIdentification
	 * EventInformation7.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation93#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation93.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation98.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation100.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation102#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation102.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation97#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation97.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventReference4#mmEventIdentification
	 * CorporateActionEventReference4.mmEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation99#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation99.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation94#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation94.mmCorporateActionEventIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation103.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference4Choice#mmLinkedCorporateActionIdentification
	 * CorporateActionEventReference4Choice.
	 * mmLinkedCorporateActionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation8#mmCorporateActionEventIdentification
	 * EventInformation8.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails33.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmCorporateActionEventIdentification
	 * Transaction49.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#mmCorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters12.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#mmCorporateActionEventIdentification
	 * AdditionalParameters25.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters16#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters16.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#mmCorporateActionEventIdentification
	 * SettlementTypeAndIdentification24.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmCorporateActionEventIdentification
	 * TransactionDetails87.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmCorporateActionEventIdentification
	 * Identification24.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#mmCorporateActionEventIdentification
	 * Transaction50.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#mmCorporateActionEventIdentification
	 * Transaction48.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters18#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters18.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters17#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters17.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation104#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation104.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement3#mmCorporateActionEventIdentification
	 * IntraBalanceMovement3.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction51#mmCorporateActionEventIdentification
	 * Transaction51.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation109.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation111.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation112.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation110.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation105.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation107.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation106.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation108.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#mmCorporateActionEventIdentification
	 * EventInformation9.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters19#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters19.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmCorporateActionEventIdentification
	 * Transaction53.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmCorporateActionEventIdentification
	 * TransactionDetails97.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmCorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters16.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmCorporateActionEventIdentification
	 * Transaction54.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmCorporateActionEventIdentification
	 * Transaction52.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#mmCorporateActionEventIdentification
	 * TransactionTypeAndAdditionalParameters19.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation114#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation114.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation120#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation120.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation115#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation115.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation118.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmCorporateActionEventIdentification
	 * Transaction57.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation121#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation121.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation123#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation123.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation117.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmCorporateActionEventIdentification
	 * SecuritiesFinancingTransactionDetails36.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation113.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters20#mmCorporateActionEventIdentification
	 * SettlementTypeAndAdditionalParameters20.
	 * mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation10#mmCorporateActionEventIdentification
	 * EventInformation10.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#mmCorporateActionEventIdentification
	 * Transaction56.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmCorporateActionEventIdentification
	 * TransactionDetails100.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#mmCorporateActionEventIdentification
	 * Transaction55.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction58#mmCorporateActionEventIdentification
	 * Transaction58.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails105#mmCorporateActionEventIdentification
	 * TransactionDetails105.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction60#mmCorporateActionEventIdentification
	 * Transaction60.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction61#mmCorporateActionEventIdentification
	 * Transaction61.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction62#mmCorporateActionEventIdentification
	 * Transaction62.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation127#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation127.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation126#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation126.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation125.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation124#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation124.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation128.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation11#mmCorporateActionEventIdentification
	 * EventInformation11.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation129#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation129.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation12#mmCorporateActionEventIdentification
	 * EventInformation12.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation130#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation130.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation131#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation131.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation132.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation134#mmCorporateActionEventIdentification
	 * CorporateActionGeneralInformation134.mmCorporateActionEventIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails110#mmCorporateActionEventIdentification
	 * TransactionDetails110.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction63#mmCorporateActionEventIdentification
	 * Transaction63.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction64#mmCorporateActionEventIdentification
	 * Transaction64.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction65#mmCorporateActionEventIdentification
	 * Transaction65.mmCorporateActionEventIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification given to the event."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEventRegistration, Max35Text> mmCorporateActionEventIdentification = new MMBusinessAttribute<CorporateActionEventRegistration, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementTypeAndAdditionalParameters6.mmCorporateActionEventIdentification, SettlementTypeAndAdditionalParameters5.mmCorporateActionEventIdentification,
					SettlementTypeAndAdditionalParameters7.mmCorporateActionEventIdentification, SettlementTypeAndAdditionalParameters8.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation8.mmCorporateActionEventIdentification, CorporateActionGeneralInformation20.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation25.mmCorporateActionEventIdentification, CorporateActionGeneralInformation32.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation35.mmCorporateActionEventIdentification, CorporateActionGeneralInformation43.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation53.mmCorporateActionEventIdentification, CorporateActionGeneralInformation56.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation57.mmCorporateActionEventIdentification, CorporateActionGeneralInformation9.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation13.mmCorporateActionEventIdentification, CorporateActionGeneralInformation34.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation42.mmCorporateActionEventIdentification, CorporateActionGeneralInformation52.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation58.mmCorporateActionEventIdentification, CorporateActionEventReference1Choice.mmLinkedCorporateActionIdentification, CorporateActionEventReference1.mmEventIdentification,
					CorporateActionGeneralInformation6.mmCorporateActionEventIdentification, CorporateActionEventReference2Choice.mmLinkedCorporateActionIdentification, CorporateActionEventReference2.mmEventIdentification,
					CorporateActionGeneralInformation15.mmCorporateActionEventIdentification, CorporateActionGeneralInformation21.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation28.mmCorporateActionEventIdentification, CorporateActionGeneralInformation36.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation44.mmCorporateActionEventIdentification, CorporateActionGeneralInformation55.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation61.mmCorporateActionEventIdentification, CorporateActionGeneralInformation7.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation26.mmCorporateActionEventIdentification, CorporateActionGeneralInformation33.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation27.mmCorporateActionEventIdentification, CorporateActionGeneralInformation41.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation49.mmCorporateActionEventIdentification, CorporateActionGeneralInformation68.mmCorporateActionEventIdentification, EventInformation1.mmCorporateActionEventIdentification,
					EventInformation2.mmCorporateActionEventIdentification, EventInformation3.mmCorporateActionEventIdentification, EventInformation4.mmCorporateActionEventIdentification,
					EventInformation5.mmCorporateActionEventIdentification, EventInformation6.mmCorporateActionEventIdentification, CorporateActionGeneralInformation4.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation16.mmCorporateActionEventIdentification, CorporateActionGeneralInformation24.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation29.mmCorporateActionEventIdentification, CorporateActionGeneralInformation39.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation47.mmCorporateActionEventIdentification, CorporateActionGeneralInformation50.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation62.mmCorporateActionEventIdentification, CorporateActionGeneralInformation3.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation17.mmCorporateActionEventIdentification, CorporateActionGeneralInformation23.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation30.mmCorporateActionEventIdentification, CorporateActionGeneralInformation38.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation46.mmCorporateActionEventIdentification, CorporateActionGeneralInformation54.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation64.mmCorporateActionEventIdentification, CorporateActionGeneralInformation63.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation11.mmCorporateActionEventIdentification, CorporateActionGeneralInformation19.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation22.mmCorporateActionEventIdentification, CorporateActionGeneralInformation31.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation37.mmCorporateActionEventIdentification, CorporateActionGeneralInformation45.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation51.mmCorporateActionEventIdentification, CorporateActionGeneralInformation67.mmCorporateActionEventIdentification, AdditionalParameters3.mmCorporateActionEventIdentification,
					AdditionalParameters7.mmCorporateActionEventIdentification, AdditionalParameters8.mmCorporateActionEventIdentification, AdditionalParameters9.mmCorporateActionEventIdentification,
					AdditionalParameters10.mmCorporateActionEventIdentification, AdditionalParameters11.mmCorporateActionEventIdentification, TransactionTypeAndAdditionalParameters3.mmCorporateActionEventIdentification,
					TransactionTypeAndAdditionalParameters6.mmCorporateActionEventIdentification, SettlementTypeAndIdentification1.mmCorporateActionEventIdentification, SettlementTypeAndIdentification8.mmCorporateActionEventIdentification,
					SettlementTypeAndIdentification9.mmCorporateActionEventIdentification, SettlementTypeAndIdentification11.mmCorporateActionEventIdentification, SettlementTypeAndIdentification15.mmCorporateActionEventIdentification,
					SettlementTypeAndIdentification17.mmCorporateActionEventIdentification, SettlementTypeAndIdentification10.mmCorporateActionEventIdentification, SettlementTypeAndIdentification12.mmCorporateActionEventIdentification,
					SettlementTypeAndAdditionalParameters1.mmCorporateActionEventIdentification, SettlementTypeAndAdditionalParameters4.mmCorporateActionEventIdentification,
					SettlementTypeAndAdditionalParameters9.mmCorporateActionEventIdentification, SettlementTypeAndAdditionalParameters10.mmCorporateActionEventIdentification, TransactionDetails5.mmCorporateActionEventIdentification,
					TransactionDetails9.mmCorporateActionEventIdentification, TransactionDetails22.mmCorporateActionEventIdentification, TransactionDetails23.mmCorporateActionEventIdentification,
					TransactionDetails36.mmCorporateActionEventIdentification, TransactionDetails47.mmCorporateActionEventIdentification, TransactionDetails53.mmCorporateActionEventIdentification,
					TransactionDetails58.mmCorporateActionEventIdentification, Transaction7.mmCorporateActionEventIdentification, Transaction8.mmCorporateActionEventIdentification, Transaction9.mmCorporateActionEventIdentification,
					Transaction10.mmCorporateActionEventIdentification, Transaction14.mmCorporateActionEventIdentification, Transaction12.mmCorporateActionEventIdentification, Transaction15.mmCorporateActionEventIdentification,
					Transaction16.mmCorporateActionEventIdentification, Transaction20.mmCorporateActionEventIdentification, Transaction19.mmCorporateActionEventIdentification, Transaction23.mmCorporateActionEventIdentification,
					Transaction22.mmCorporateActionEventIdentification, Transaction28.mmCorporateActionEventIdentification, Transaction27.mmCorporateActionEventIdentification, Transaction30.mmCorporateActionEventIdentification,
					Transaction31.mmCorporateActionEventIdentification, Transaction6.mmCorporateActionEventIdentification, Transaction11.mmCorporateActionEventIdentification, Transaction13.mmCorporateActionEventIdentification,
					Transaction17.mmCorporateActionEventIdentification, Transaction18.mmCorporateActionEventIdentification, Transaction21.mmCorporateActionEventIdentification, Transaction29.mmCorporateActionEventIdentification,
					Transaction32.mmCorporateActionEventIdentification, Identification2.mmCorporateActionEventIdentification, CorporateAction9.mmEventIdentification, CorporateActionInformation2.mmIssuerCorporateActionIdentification,
					CorporateActionInformation2.mmCorporateActionProcessingIdentification, CorporateActionInformation1.mmIssuerCorporateActionIdentification, CorporateActionInformation1.mmCorporateActionProcessingIdentification,
					SecuritiesFinancingTransactionDetails2.mmCorporateActionEventIdentification, SecuritiesFinancingTransactionDetails8.mmCorporateActionEventIdentification, Identification7.mmCorporateActionEventIdentification,
					Identification6.mmCorporateActionEventIdentification, CorporateActionGeneralInformation10.mmCorporateActionEventIdentification, CorporateActionGeneralInformation18.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation40.mmCorporateActionEventIdentification, CorporateActionGeneralInformation48.mmCorporateActionEventIdentification,
					SecuritiesFinancingTransactionDetails6.mmCorporateActionEventIdentification, SecuritiesFinancingTransactionDetails10.mmCorporateActionEventIdentification,
					SecuritiesFinancingTransactionDetails17.mmCorporateActionEventIdentification, SecuritiesFinancingTransactionDetails18.mmCorporateActionEventIdentification, Identification5.mmCorporateActionEventIdentification,
					Identification8.mmCorporateActionEventIdentification, Identification11.mmCorporateActionEventIdentification, Identification13.mmCorporateActionEventIdentification, Identification9.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation14.mmCorporateActionEventIdentification, IntraBalanceMovement1.mmCorporateActionEventIdentification, Transaction25.mmCorporateActionEventIdentification,
					References36Choice.mmCorporateActionEventIdentification, References35Choice.mmCorporateActionEventIdentification, CorporateActionGeneralInformation12.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation5.mmCorporateActionEventIdentification, Identification3.mmCorporateActionEventIdentification, AdditionalParameters16.mmCorporateActionEventIdentification,
					TransactionDetails61.mmCorporateActionEventIdentification, Transaction34.mmCorporateActionEventIdentification, SecuritiesFinancingTransactionDetails21.mmCorporateActionEventIdentification,
					Transaction35.mmCorporateActionEventIdentification, Transaction36.mmCorporateActionEventIdentification, CorporateActionGeneralInformation71.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation69.mmCorporateActionEventIdentification, CorporateActionGeneralInformation70.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation78.mmCorporateActionEventIdentification, CorporateActionGeneralInformation77.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation76.mmCorporateActionEventIdentification, SecuritiesFinancingTransactionDetails22.mmCorporateActionEventIdentification, Transaction38.mmCorporateActionEventIdentification,
					TransactionDetails66.mmCorporateActionEventIdentification, Transaction39.mmCorporateActionEventIdentification, Transaction37.mmCorporateActionEventIdentification,
					SecuritiesFinancingTransactionDetails24.mmCorporateActionEventIdentification, Transaction41.mmCorporateActionEventIdentification, TransactionDetails70.mmCorporateActionEventIdentification,
					Transaction40.mmCorporateActionEventIdentification, CorporateActionGeneralInformation79.mmCorporateActionEventIdentification, CorporateActionGeneralInformation83.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation82.mmCorporateActionEventIdentification, Transaction43.mmCorporateActionEventIdentification, TransactionDetails71.mmCorporateActionEventIdentification,
					SecuritiesFinancingTransactionDetails25.mmCorporateActionEventIdentification, Transaction42.mmCorporateActionEventIdentification, Transaction47.mmCorporateActionEventIdentification,
					SecuritiesFinancingTransactionDetails26.mmCorporateActionEventIdentification, TransactionDetails79.mmCorporateActionEventIdentification, Transaction45.mmCorporateActionEventIdentification,
					Transaction46.mmCorporateActionEventIdentification, SettlementTypeAndIdentification19.mmCorporateActionEventIdentification, TransactionTypeAndAdditionalParameters10.mmCorporateActionEventIdentification,
					SettlementTypeAndAdditionalParameters11.mmCorporateActionEventIdentification, AdditionalParameters21.mmCorporateActionEventIdentification, SettlementTypeAndAdditionalParameters14.mmCorporateActionEventIdentification,
					Identification15.mmCorporateActionEventIdentification, SettlementTypeAndAdditionalParameters13.mmCorporateActionEventIdentification, CorporateActionGeneralInformation92.mmCorporateActionEventIdentification,
					CorporateActionEventReference3.mmEventIdentification, CorporateActionGeneralInformation89.mmCorporateActionEventIdentification, CorporateActionGeneralInformation88.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation86.mmCorporateActionEventIdentification, CorporateActionGeneralInformation91.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation87.mmCorporateActionEventIdentification, CorporateActionGeneralInformation84.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation85.mmCorporateActionEventIdentification, CorporateActionGeneralInformation90.mmCorporateActionEventIdentification,
					CorporateActionEventReference3Choice.mmLinkedCorporateActionIdentification, EventInformation7.mmCorporateActionEventIdentification, CorporateActionGeneralInformation93.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation98.mmCorporateActionEventIdentification, CorporateActionGeneralInformation100.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation102.mmCorporateActionEventIdentification, CorporateActionGeneralInformation97.mmCorporateActionEventIdentification, CorporateActionEventReference4.mmEventIdentification,
					CorporateActionGeneralInformation99.mmCorporateActionEventIdentification, CorporateActionGeneralInformation94.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation103.mmCorporateActionEventIdentification, CorporateActionEventReference4Choice.mmLinkedCorporateActionIdentification, EventInformation8.mmCorporateActionEventIdentification,
					SecuritiesFinancingTransactionDetails33.mmCorporateActionEventIdentification, Transaction49.mmCorporateActionEventIdentification, TransactionTypeAndAdditionalParameters12.mmCorporateActionEventIdentification,
					AdditionalParameters25.mmCorporateActionEventIdentification, SettlementTypeAndAdditionalParameters16.mmCorporateActionEventIdentification, SettlementTypeAndIdentification24.mmCorporateActionEventIdentification,
					TransactionDetails87.mmCorporateActionEventIdentification, Identification24.mmCorporateActionEventIdentification, Transaction50.mmCorporateActionEventIdentification, Transaction48.mmCorporateActionEventIdentification,
					SettlementTypeAndAdditionalParameters18.mmCorporateActionEventIdentification, SettlementTypeAndAdditionalParameters17.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation104.mmCorporateActionEventIdentification, IntraBalanceMovement3.mmCorporateActionEventIdentification, Transaction51.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation109.mmCorporateActionEventIdentification, CorporateActionGeneralInformation111.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation112.mmCorporateActionEventIdentification, CorporateActionGeneralInformation110.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation105.mmCorporateActionEventIdentification, CorporateActionGeneralInformation107.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation106.mmCorporateActionEventIdentification, CorporateActionGeneralInformation108.mmCorporateActionEventIdentification, EventInformation9.mmCorporateActionEventIdentification,
					SettlementTypeAndAdditionalParameters19.mmCorporateActionEventIdentification, Transaction53.mmCorporateActionEventIdentification, TransactionDetails97.mmCorporateActionEventIdentification,
					TransactionTypeAndAdditionalParameters16.mmCorporateActionEventIdentification, SecuritiesFinancingTransactionDetails35.mmCorporateActionEventIdentification, Transaction54.mmCorporateActionEventIdentification,
					Transaction52.mmCorporateActionEventIdentification, TransactionTypeAndAdditionalParameters19.mmCorporateActionEventIdentification, CorporateActionGeneralInformation114.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation120.mmCorporateActionEventIdentification, CorporateActionGeneralInformation115.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation118.mmCorporateActionEventIdentification, Transaction57.mmCorporateActionEventIdentification, CorporateActionGeneralInformation121.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation123.mmCorporateActionEventIdentification, CorporateActionGeneralInformation117.mmCorporateActionEventIdentification,
					SecuritiesFinancingTransactionDetails36.mmCorporateActionEventIdentification, CorporateActionGeneralInformation113.mmCorporateActionEventIdentification,
					SettlementTypeAndAdditionalParameters20.mmCorporateActionEventIdentification, EventInformation10.mmCorporateActionEventIdentification, Transaction56.mmCorporateActionEventIdentification,
					TransactionDetails100.mmCorporateActionEventIdentification, Transaction55.mmCorporateActionEventIdentification, Transaction58.mmCorporateActionEventIdentification,
					TransactionDetails105.mmCorporateActionEventIdentification, Transaction60.mmCorporateActionEventIdentification, Transaction61.mmCorporateActionEventIdentification, Transaction62.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation127.mmCorporateActionEventIdentification, CorporateActionGeneralInformation126.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation125.mmCorporateActionEventIdentification, CorporateActionGeneralInformation124.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation128.mmCorporateActionEventIdentification, EventInformation11.mmCorporateActionEventIdentification, CorporateActionGeneralInformation129.mmCorporateActionEventIdentification,
					EventInformation12.mmCorporateActionEventIdentification, CorporateActionGeneralInformation130.mmCorporateActionEventIdentification, CorporateActionGeneralInformation131.mmCorporateActionEventIdentification,
					CorporateActionGeneralInformation132.mmCorporateActionEventIdentification, CorporateActionGeneralInformation134.mmCorporateActionEventIdentification, TransactionDetails110.mmCorporateActionEventIdentification,
					Transaction63.mmCorporateActionEventIdentification, Transaction64.mmCorporateActionEventIdentification, Transaction65.mmCorporateActionEventIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Identification given to the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CorporateActionEventRegistration obj) {
			return obj.getCorporateActionEventIdentification();
		}

		@Override
		public void setValue(CorporateActionEventRegistration obj, Max35Text value) {
			obj.setCorporateActionEventIdentification(value);
		}
	};
	protected Max35Text officialCorporateActionEventIdentification;
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation8#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation8.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation20#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation20.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation25#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation25.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation32#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation32.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation35#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation35.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation43#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation43.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation53#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation53.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation56#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation56.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation57#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation57.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation9#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation9.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation13#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation13.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation34#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation34.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation42#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation42.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation52#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation52.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation58#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation58.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference1Choice#mmLinkedOfficialCorporateActionEventIdentification
	 * CorporateActionEventReference1Choice.
	 * mmLinkedOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation6#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation6.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference2Choice#mmLinkedOfficialCorporateActionEventIdentification
	 * CorporateActionEventReference2Choice.
	 * mmLinkedOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation15#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation15.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation21#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation21.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation28#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation28.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation36#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation36.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation44#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation44.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation55#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation55.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation61#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation61.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation7#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation7.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation26#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation26.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation33#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation33.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation27#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation27.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation41#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation41.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation49#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation49.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation68#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation68.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation1#mmOfficialCorporateActionEventIdentification
	 * EventInformation1.mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation2#mmOfficialCorporateActionEventIdentification
	 * EventInformation2.mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation3#mmOfficialCorporateActionEventIdentification
	 * EventInformation3.mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation4#mmOfficialCorporateActionEventIdentification
	 * EventInformation4.mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation5#mmOfficialCorporateActionEventIdentification
	 * EventInformation5.mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation6#mmOfficialCorporateActionEventIdentification
	 * EventInformation6.mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation4#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation4.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation16#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation16.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation24#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation24.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation29#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation29.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation39#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation39.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation47#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation47.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation50#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation50.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation62#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation62.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation3#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation3.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation17#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation17.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation23#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation23.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation30#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation30.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation38#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation38.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation46#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation46.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation54#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation54.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation64#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation64.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation63#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation63.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation11#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation11.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation19#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation19.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation22#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation22.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation31#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation31.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation37#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation37.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation45#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation45.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation51#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation51.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation67#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation67.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation10#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation10.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation18#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation18.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation40#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation40.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation48#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation48.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation14#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation14.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation12#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation12.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation5#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation5.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation71#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation71.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation69#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation69.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation70#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation70.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation78#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation78.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation77#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation77.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation76#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation76.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation79#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation79.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation83#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation83.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation82#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation82.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation92#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation92.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation89#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation89.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation88#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation88.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation86#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation86.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation91#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation91.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation87#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation87.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation84#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation84.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation85#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation85.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation90#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation90.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference3Choice#mmLinkedOfficialCorporateActionEventIdentification
	 * CorporateActionEventReference3Choice.
	 * mmLinkedOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation7#mmOfficialCorporateActionEventIdentification
	 * EventInformation7.mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation93#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation93.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation98#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation98.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation100#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation100.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation102#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation102.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation97#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation97.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation99#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation99.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation94#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation94.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation103#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation103.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventReference4Choice#mmLinkedOfficialCorporateActionEventIdentification
	 * CorporateActionEventReference4Choice.
	 * mmLinkedOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation8#mmOfficialCorporateActionEventIdentification
	 * EventInformation8.mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation104#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation104.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation109#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation109.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation111#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation111.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation112#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation112.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation110#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation110.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation105#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation105.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation107#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation107.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation106#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation106.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation108#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation108.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation9#mmOfficialCorporateActionEventIdentification
	 * EventInformation9.mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation114#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation114.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation120#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation120.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation115#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation115.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation118#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation118.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation121#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation121.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation123#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation123.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation117#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation117.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation113#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation113.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation10#mmOfficialCorporateActionEventIdentification
	 * EventInformation10.mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation127#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation127.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation126#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation126.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation125#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation125.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation124#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation124.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation128#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation128.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation11#mmOfficialCorporateActionEventIdentification
	 * EventInformation11.mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation129#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation129.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EventInformation12#mmOfficialCorporateActionEventIdentification
	 * EventInformation12.mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation130#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation130.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation131#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation131.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation132#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation132.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation134#mmOfficialCorporateActionEventIdentification
	 * CorporateActionGeneralInformation134.
	 * mmOfficialCorporateActionEventIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialCorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a corporate action assigned by an official central body/entity within a given market."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEventRegistration, Max35Text> mmOfficialCorporateActionEventIdentification = new MMBusinessAttribute<CorporateActionEventRegistration, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionGeneralInformation8.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation20.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation25.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation32.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation35.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation43.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation53.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation56.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation57.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation9.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation13.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation34.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation42.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation52.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation58.mmOfficialCorporateActionEventIdentification, CorporateActionEventReference1Choice.mmLinkedOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation6.mmOfficialCorporateActionEventIdentification, CorporateActionEventReference2Choice.mmLinkedOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation15.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation21.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation28.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation36.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation44.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation55.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation61.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation7.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation26.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation33.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation27.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation41.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation49.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation68.mmOfficialCorporateActionEventIdentification,
					EventInformation1.mmOfficialCorporateActionEventIdentification, EventInformation2.mmOfficialCorporateActionEventIdentification, EventInformation3.mmOfficialCorporateActionEventIdentification,
					EventInformation4.mmOfficialCorporateActionEventIdentification, EventInformation5.mmOfficialCorporateActionEventIdentification, EventInformation6.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation4.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation16.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation24.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation29.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation39.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation47.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation50.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation62.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation3.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation17.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation23.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation30.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation38.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation46.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation54.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation64.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation63.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation11.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation19.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation22.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation31.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation37.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation45.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation51.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation67.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation10.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation18.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation40.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation48.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation14.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation12.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation5.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation71.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation69.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation70.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation78.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation77.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation76.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation79.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation83.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation82.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation92.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation89.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation88.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation86.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation91.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation87.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation84.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation85.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation90.mmOfficialCorporateActionEventIdentification,
					CorporateActionEventReference3Choice.mmLinkedOfficialCorporateActionEventIdentification, EventInformation7.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation93.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation98.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation100.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation102.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation97.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation99.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation94.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation103.mmOfficialCorporateActionEventIdentification,
					CorporateActionEventReference4Choice.mmLinkedOfficialCorporateActionEventIdentification, EventInformation8.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation104.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation109.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation111.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation112.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation110.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation105.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation107.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation106.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation108.mmOfficialCorporateActionEventIdentification, EventInformation9.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation114.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation120.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation115.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation118.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation121.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation123.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation117.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation113.mmOfficialCorporateActionEventIdentification,
					EventInformation10.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation127.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation126.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation125.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation124.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation128.mmOfficialCorporateActionEventIdentification,
					EventInformation11.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation129.mmOfficialCorporateActionEventIdentification, EventInformation12.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation130.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation131.mmOfficialCorporateActionEventIdentification,
					CorporateActionGeneralInformation132.mmOfficialCorporateActionEventIdentification, CorporateActionGeneralInformation134.mmOfficialCorporateActionEventIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfficialCorporateActionEventIdentification";
			definition = "Identification of a corporate action assigned by an official central body/entity within a given market.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CorporateActionEventRegistration obj) {
			return obj.getOfficialCorporateActionEventIdentification();
		}

		@Override
		public void setValue(CorporateActionEventRegistration obj, Max35Text value) {
			obj.setOfficialCorporateActionEventIdentification(value);
		}
	};
	protected ISODateTime officialAnnouncementPublicationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate1.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate13.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate14.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate21.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate22.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate25.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate27.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate28.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotification1#mmOfficialAnnouncementPublicationDate
	 * CorporateActionNotification1.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate44.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate58.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate61.mmOfficialAnnouncementPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmOfficialAnnouncementPublicationDate
	 * CorporateActionDate74.mmOfficialAnnouncementPublicationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialAnnouncementPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CorporateActionEventRegistration, ISODateTime> mmOfficialAnnouncementPublicationDate = new MMBusinessAttribute<CorporateActionEventRegistration, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmOfficialAnnouncementPublicationDate, CorporateActionDate13.mmOfficialAnnouncementPublicationDate, CorporateActionDate14.mmOfficialAnnouncementPublicationDate,
					CorporateActionDate21.mmOfficialAnnouncementPublicationDate, CorporateActionDate22.mmOfficialAnnouncementPublicationDate, CorporateActionDate25.mmOfficialAnnouncementPublicationDate,
					CorporateActionDate27.mmOfficialAnnouncementPublicationDate, CorporateActionDate28.mmOfficialAnnouncementPublicationDate, CorporateActionNotification1.mmOfficialAnnouncementPublicationDate,
					CorporateActionDate44.mmOfficialAnnouncementPublicationDate, CorporateActionDate58.mmOfficialAnnouncementPublicationDate, CorporateActionDate61.mmOfficialAnnouncementPublicationDate,
					CorporateActionDate74.mmOfficialAnnouncementPublicationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfficialAnnouncementPublicationDate";
			definition = "Date/time at which the corporate action is legally announced by an official body, for example, publication by a governmental administration.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CorporateActionEventRegistration obj) {
			return obj.getOfficialAnnouncementPublicationDate();
		}

		@Override
		public void setValue(CorporateActionEventRegistration obj, ISODateTime value) {
			obj.setOfficialAnnouncementPublicationDate(value);
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionEventRegistration
	 * CorporateActionEvent.mmCorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration
	 * CorporateActionEventRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which a registration is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CorporateActionEventRegistration, Optional<CorporateActionEvent>> mmCorporateActionEvent = new MMBusinessAssociationEnd<CorporateActionEventRegistration, Optional<CorporateActionEvent>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionEventRegistration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a registration is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CorporateActionEvent.mmCorporateActionEventRegistration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CorporateActionEvent.mmObject();
		}

		@Override
		public Optional<CorporateActionEvent> getValue(CorporateActionEventRegistration obj) {
			return obj.getCorporateActionEvent();
		}

		@Override
		public void setValue(CorporateActionEventRegistration obj, Optional<CorporateActionEvent> value) {
			obj.setCorporateActionEvent(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventRegistration";
				definition = "Specifies the official date and identification of the event.";
				associationDomain_lazy = () -> Arrays.asList(CorporateActionEvent.mmCorporateActionEventRegistration);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEventRegistration.mmCorporateActionEventIdentification,
						com.tools20022.repository.entity.CorporateActionEventRegistration.mmOfficialCorporateActionEventIdentification,
						com.tools20022.repository.entity.CorporateActionEventRegistration.mmOfficialAnnouncementPublicationDate, com.tools20022.repository.entity.CorporateActionEventRegistration.mmCorporateActionEvent);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionEventReference1Choice.mmObject(), CorporateActionEventReference1.mmObject(), CorporateActionEventReference2Choice.mmObject(),
						CorporateActionEventReference2.mmObject(), CorporateActionEventReference3.mmObject(), CorporateActionEventReference3Choice.mmObject(), CorporateActionEventReference4.mmObject(),
						CorporateActionEventReference4Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionEventRegistration.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCorporateActionEventIdentification() {
		return corporateActionEventIdentification;
	}

	public CorporateActionEventRegistration setCorporateActionEventIdentification(Max35Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = Objects.requireNonNull(corporateActionEventIdentification);
		return this;
	}

	public Max35Text getOfficialCorporateActionEventIdentification() {
		return officialCorporateActionEventIdentification;
	}

	public CorporateActionEventRegistration setOfficialCorporateActionEventIdentification(Max35Text officialCorporateActionEventIdentification) {
		this.officialCorporateActionEventIdentification = Objects.requireNonNull(officialCorporateActionEventIdentification);
		return this;
	}

	public ISODateTime getOfficialAnnouncementPublicationDate() {
		return officialAnnouncementPublicationDate;
	}

	public CorporateActionEventRegistration setOfficialAnnouncementPublicationDate(ISODateTime officialAnnouncementPublicationDate) {
		this.officialAnnouncementPublicationDate = Objects.requireNonNull(officialAnnouncementPublicationDate);
		return this;
	}

	public Optional<CorporateActionEvent> getCorporateActionEvent() {
		return corporateActionEvent == null ? Optional.empty() : Optional.of(corporateActionEvent);
	}

	public CorporateActionEventRegistration setCorporateActionEvent(CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
		return this;
	}
}