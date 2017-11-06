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
import com.tools20022.repository.codeset.AuthorityExchangeReasonCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for the exchange with the national competent authority.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
 * AuthorityExchangeReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#mmCompetentAuthorityForInstrument
 * AuthorityExchangeReason1Code.mmCompetentAuthorityForInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#mmAdHocRequest
 * AuthorityExchangeReason1Code.mmAdHocRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#mmCompetentAuthorityForBasketConstituent
 * AuthorityExchangeReason1Code.mmCompetentAuthorityForBasketConstituent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#mmCompetentAuthorityForBuyerBranch
 * AuthorityExchangeReason1Code.mmCompetentAuthorityForBuyerBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#mmCompetentAuthorityForDecisionMakingBranch
 * AuthorityExchangeReason1Code.mmCompetentAuthorityForDecisionMakingBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#mmCompetentAuthorityForDirectUnderlying
 * AuthorityExchangeReason1Code.mmCompetentAuthorityForDirectUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#mmCompetentAuthorityForExecutingBranch
 * AuthorityExchangeReason1Code.mmCompetentAuthorityForExecutingBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#mmCompetentAuthorityForIndex
 * AuthorityExchangeReason1Code.mmCompetentAuthorityForIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#mmCompetentAuthorityForMembershipBranch
 * AuthorityExchangeReason1Code.mmCompetentAuthorityForMembershipBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#mmCompetentAuthorityForSellerBranch
 * AuthorityExchangeReason1Code.mmCompetentAuthorityForSellerBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code#mmCompetentAuthorityForTradingVenue
 * AuthorityExchangeReason1Code.mmCompetentAuthorityForTradingVenue}</li>
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
 * "AuthorityExchangeReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for the exchange with the national competent authority."
 * </li>
 * </ul>
 */
public class AuthorityExchangeReason1Code extends AuthorityExchangeReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForInstrument"</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForInstrument = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForInstrument";
			owner_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdHocRequest"</li>
	 * </ul>
	 */
	public static final MMCode mmAdHocRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdHocRequest";
			owner_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForBasketConstituent"</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForBasketConstituent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForBasketConstituent";
			owner_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForBuyerBranch"</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForBuyerBranch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForBuyerBranch";
			owner_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForDecisionMakingBranch"</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForDecisionMakingBranch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForDecisionMakingBranch";
			owner_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForDirectUnderlying"</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForDirectUnderlying = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForDirectUnderlying";
			owner_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForExecutingBranch"</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForExecutingBranch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForExecutingBranch";
			owner_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForIndex"</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForIndex = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForIndex";
			owner_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForMembershipBranch"</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForMembershipBranch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForMembershipBranch";
			owner_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForSellerBranch"</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForSellerBranch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForSellerBranch";
			owner_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
	 * AuthorityExchangeReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForTradingVenue"</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForTradingVenue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForTradingVenue";
			owner_lazy = () -> AuthorityExchangeReason1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AuthorityExchangeReason1Code";
				definition = "Specifies the reason for the exchange with the national competent authority.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmCompetentAuthorityForInstrument, com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmAdHocRequest,
						com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmCompetentAuthorityForBasketConstituent, com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmCompetentAuthorityForBuyerBranch,
						com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmCompetentAuthorityForDecisionMakingBranch, com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmCompetentAuthorityForDirectUnderlying,
						com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmCompetentAuthorityForExecutingBranch, com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmCompetentAuthorityForIndex,
						com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmCompetentAuthorityForMembershipBranch, com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmCompetentAuthorityForSellerBranch,
						com.tools20022.repository.codeset.AuthorityExchangeReason1Code.mmCompetentAuthorityForTradingVenue);
				trace_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}