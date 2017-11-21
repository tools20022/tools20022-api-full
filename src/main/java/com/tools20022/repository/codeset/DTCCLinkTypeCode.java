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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies types of linked events.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode#mmCorrespondingEvent
 * DTCCLinkTypeCode.mmCorrespondingEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode#mmDuplicate
 * DTCCLinkTypeCode.mmDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode#mmEventChangeToMandatory
 * DTCCLinkTypeCode.mmEventChangeToMandatory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode#mmEventChangeToVoluntary
 * DTCCLinkTypeCode.mmEventChangeToVoluntary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode#mmFractionalSecurity
 * DTCCLinkTypeCode.mmFractionalSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode#mmPartOfHybridSecurity
 * DTCCLinkTypeCode.mmPartOfHybridSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode#mmEventOnIntermediarySecurity
 * DTCCLinkTypeCode.mmEventOnIntermediarySecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode#mmInsuredUninsuredSecurities
 * DTCCLinkTypeCode.mmInsuredUninsuredSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode#mmEventConvertedToNewEvent
 * DTCCLinkTypeCode.mmEventConvertedToNewEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode#mmMultiMarket
 * DTCCLinkTypeCode.mmMultiMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode#mmOther
 * DTCCLinkTypeCode.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCLinkType1Code
 * DTCCLinkType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"COEV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCLinkTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies types of linked events."</li>
 * </ul>
 */
public class DTCCLinkTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Events that are concurrent and affect the same underlying security (for
	 * example: Stock Split followed by a Reverse Split).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
	 * DTCCLinkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COEV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrespondingEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Events that are concurrent and affect the same underlying security (for example: Stock Split followed by a Reverse Split)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCorrespondingEvent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrespondingEvent";
			definition = "Events that are concurrent and affect the same underlying security (for example: Stock Split followed by a Reverse Split).";
			owner_lazy = () -> DTCCLinkTypeCode.mmObject();
			codeName = "COEV";
		}
	};
	/**
	 * Events (event records) are duplicate of each other.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
	 * DTCCLinkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DUPE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Events (event records) are duplicate of each other."</li>
	 * </ul>
	 */
	public static final MMCode mmDuplicate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Duplicate";
			definition = "Events (event records) are duplicate of each other.";
			owner_lazy = () -> DTCCLinkTypeCode.mmObject();
			codeName = "DUPE";
		}
	};
	/**
	 * Events that are consecutive and evolve from a Voluntary Event to a
	 * Mandatory Event but of the same basic GCA (Global Corporate Actions
	 * validation service) event type. For example Exchange - Voluntary to
	 * Exchange - Mandatory. Note: The old and new events should not overlap and
	 * the older event will remain in an "approved" state.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
	 * DTCCLinkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventChangeToMandatory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Events that are consecutive and evolve from a Voluntary Event to a Mandatory Event but of the same basic GCA (Global Corporate Actions validation service) event type. For example Exchange - Voluntary to Exchange - Mandatory.  Note: The old and new events should not overlap and the older event will remain in an \"approved\" state."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEventChangeToMandatory = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventChangeToMandatory";
			definition = "Events that are consecutive and evolve from a Voluntary Event to a Mandatory Event but of the same basic GCA (Global Corporate Actions validation service) event type. For example Exchange - Voluntary to Exchange - Mandatory.  Note: The old and new events should not overlap and the older event will remain in an \"approved\" state.";
			owner_lazy = () -> DTCCLinkTypeCode.mmObject();
			codeName = "CHMA";
		}
	};
	/**
	 * Event that are consecutive and evolve from a Mandatory Event to a
	 * voluntary event (for example Merger-Mandatory becomes a
	 * Merger-Voluntary).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
	 * DTCCLinkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHVO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventChangeToVoluntary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event that are consecutive and evolve from a Mandatory Event to a voluntary event (for example Merger-Mandatory becomes a Merger-Voluntary)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEventChangeToVoluntary = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventChangeToVoluntary";
			definition = "Event that are consecutive and evolve from a Mandatory Event to a voluntary event (for example Merger-Mandatory becomes a Merger-Voluntary).";
			owner_lazy = () -> DTCCLinkTypeCode.mmObject();
			codeName = "CHVO";
		}
	};
	/**
	 * Events are linked because of fractional security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
	 * DTCCLinkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Events are linked because of fractional security."</li>
	 * </ul>
	 */
	public static final MMCode mmFractionalSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalSecurity";
			definition = "Events are linked because of fractional security.";
			owner_lazy = () -> DTCCLinkTypeCode.mmObject();
			codeName = "FRSE";
		}
	};
	/**
	 * Events are linked because of underlying security is part of hybrid
	 * security. Hybrid securities have underlying securities. As an example
	 * Telecom hybrid security is made of various Telecom securities, example
	 * ATT, Verizon etc. When there is a dividend on the underlying security the
	 * hybrid pays as well. Announcements are linked under the hybrid security
	 * payment announcement to the underlying security that is paying that
	 * event. This is the way the holders of the hybrid are informed where this
	 * income is being derived from, since on many occasions there can be
	 * multiple announcements under the hybrid at the same time since the
	 * underlying securities are paying a distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
	 * DTCCLinkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HYBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartOfHybridSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Events are linked because of underlying security is part of hybrid security. Hybrid securities have underlying securities. As an example Telecom hybrid security is made of various Telecom securities, example ATT, Verizon etc. When there is a dividend on the underlying security the hybrid pays as well. Announcements are linked under the hybrid security payment announcement to the underlying security that is paying that event. This is the way the holders of the hybrid are informed where this income is being derived from, since on many occasions there can be multiple announcements under the hybrid at the same time since the underlying securities are paying a distribution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartOfHybridSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartOfHybridSecurity";
			definition = "Events are linked because of underlying security is part of hybrid security. Hybrid securities have underlying securities. As an example Telecom hybrid security is made of various Telecom securities, example ATT, Verizon etc. When there is a dividend on the underlying security the hybrid pays as well. Announcements are linked under the hybrid security payment announcement to the underlying security that is paying that event. This is the way the holders of the hybrid are informed where this income is being derived from, since on many occasions there can be multiple announcements under the hybrid at the same time since the underlying securities are paying a distribution.";
			owner_lazy = () -> DTCCLinkTypeCode.mmObject();
			codeName = "HYBS";
		}
	};
	/**
	 * Events are linked because of an intermediary security (for example Rights
	 * Distribution to a Rights Subscription; Rights Subscription to an
	 * Assimilation).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
	 * DTCCLinkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISEV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventOnIntermediarySecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Events are linked because of an intermediary security (for example Rights Distribution to a Rights Subscription; Rights Subscription to an Assimilation)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEventOnIntermediarySecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventOnIntermediarySecurity";
			definition = "Events are linked because of an intermediary security (for example Rights Distribution to a Rights Subscription; Rights Subscription to an Assimilation).";
			owner_lazy = () -> DTCCLinkTypeCode.mmObject();
			codeName = "ISEV";
		}
	};
	/**
	 * Events are linked because of insured or uninsured securities. In the
	 * market there are many securities where a municipality or issuer will
	 * insure a portion of their outstanding principal. It technically is the
	 * same security, however, there are two different CUSIPs one for the
	 * insured piece and the other for the un insured part.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
	 * DTCCLinkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IUNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuredUninsuredSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Events are linked because of insured or uninsured securities. In the market there are many securities where a municipality or issuer will insure a portion of their outstanding principal. It technically is the same security, however, there are two different CUSIPs one for the insured piece and the other for the un insured part."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInsuredUninsuredSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuredUninsuredSecurities";
			definition = "Events are linked because of insured or uninsured securities. In the market there are many securities where a municipality or issuer will insure a portion of their outstanding principal. It technically is the same security, however, there are two different CUSIPs one for the insured piece and the other for the un insured part.";
			owner_lazy = () -> DTCCLinkTypeCode.mmObject();
			codeName = "IUNS";
		}
	};
	/**
	 * Event that are consecutive but of a different GCA (Global Corporate
	 * actions validation service) event type. For example Tender converts to
	 * Merger Voluntary when 429 Notice issued. Note: the old and new events
	 * should not overlap and the older event will remain in an "approved"
	 * state.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
	 * DTCCLinkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TONU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventConvertedToNewEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event that are consecutive but of a different GCA (Global Corporate actions validation service) event type. For example Tender converts to Merger Voluntary when 429 Notice issued.  Note: the old and new events should not overlap and the older event will remain in an \"approved\" state."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEventConvertedToNewEvent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventConvertedToNewEvent";
			definition = "Event that are consecutive but of a different GCA (Global Corporate actions validation service) event type. For example Tender converts to Merger Voluntary when 429 Notice issued.  Note: the old and new events should not overlap and the older event will remain in an \"approved\" state.";
			owner_lazy = () -> DTCCLinkTypeCode.mmObject();
			codeName = "TONU";
		}
	};
	/**
	 * Events are linked because event security is listed in another market
	 * under another market security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
	 * DTCCLinkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MMKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultiMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Events are linked because event security is listed in another market under another market security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMultiMarket = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultiMarket";
			definition = "Events are linked because event security is listed in another market under another market security.";
			owner_lazy = () -> DTCCLinkTypeCode.mmObject();
			codeName = "MMKT";
		}
	};
	/**
	 * Cannot be classified by any of the link types.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCLinkTypeCode
	 * DTCCLinkTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cannot be classified by any of the link types."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Cannot be classified by any of the link types.";
			owner_lazy = () -> DTCCLinkTypeCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("COEV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCLinkTypeCode";
				definition = "Specifies types of linked events.";
				code_lazy = () -> Arrays.asList(DTCCLinkTypeCode.mmCorrespondingEvent, DTCCLinkTypeCode.mmDuplicate, DTCCLinkTypeCode.mmEventChangeToMandatory, DTCCLinkTypeCode.mmEventChangeToVoluntary,
						DTCCLinkTypeCode.mmFractionalSecurity, DTCCLinkTypeCode.mmPartOfHybridSecurity, DTCCLinkTypeCode.mmEventOnIntermediarySecurity, DTCCLinkTypeCode.mmInsuredUninsuredSecurities,
						DTCCLinkTypeCode.mmEventConvertedToNewEvent, DTCCLinkTypeCode.mmMultiMarket, DTCCLinkTypeCode.mmOther);
				derivation_lazy = () -> Arrays.asList(DTCCLinkType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}