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
 * Specifies the reason for the exchange with the national competent authority.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReason1Code
 * AuthorityExchangeReason1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmCompetentAuthorityForInstrument
 * AuthorityExchangeReasonCode.mmCompetentAuthorityForInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmCompetentAuthorityForHeadquarter
 * AuthorityExchangeReasonCode.mmCompetentAuthorityForHeadquarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmAdHocRequest
 * AuthorityExchangeReasonCode.mmAdHocRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmOther
 * AuthorityExchangeReasonCode.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmCompetentAuthorityForDirectUnderlying
 * AuthorityExchangeReasonCode.mmCompetentAuthorityForDirectUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmCompetentAuthorityForBasketConstituent
 * AuthorityExchangeReasonCode.mmCompetentAuthorityForBasketConstituent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmCompetentAuthorityForBuyerBranch
 * AuthorityExchangeReasonCode.mmCompetentAuthorityForBuyerBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmCompetentAuthorityForSellerBranch
 * AuthorityExchangeReasonCode.mmCompetentAuthorityForSellerBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmCompetentAuthorityForMembershipBranch
 * AuthorityExchangeReasonCode.mmCompetentAuthorityForMembershipBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmCompetentAuthorityForDecisionMakingBranch
 * AuthorityExchangeReasonCode.mmCompetentAuthorityForDecisionMakingBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmCompetentAuthorityForExecutingBranch
 * AuthorityExchangeReasonCode.mmCompetentAuthorityForExecutingBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmCompetentAuthorityForTradingVenue
 * AuthorityExchangeReasonCode.mmCompetentAuthorityForTradingVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode#mmCompetentAuthorityForIndex
 * AuthorityExchangeReasonCode.mmCompetentAuthorityForIndex}</li>
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
 * "AuthorityExchangeReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for the exchange with the national competent authority."
 * </li>
 * </ul>
 */
public class AuthorityExchangeReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Competent Authority for Instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Instrument."</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForInstrument = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForInstrument";
			definition = "Competent Authority for Instrument.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "CAFI";
		}
	};
	/**
	 * Competent Authority for Headquarter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAFH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForHeadquarter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Headquarter."</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForHeadquarter = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForHeadquarter";
			definition = "Competent Authority for Headquarter.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "CAFH";
		}
	};
	/**
	 * Ad Hoc Request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdHocRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ad Hoc Request."</li>
	 * </ul>
	 */
	public static final MMCode mmAdHocRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdHocRequest";
			definition = "Ad Hoc Request.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "ADHR";
		}
	};
	/**
	 * Where reason code is not previously defined.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
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
	 * definition} = "Where reason code is not previously defined."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Where reason code is not previously defined.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Competent Authority for Direct Underlying.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForDirectUnderlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Direct Underlying."</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForDirectUnderlying = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForDirectUnderlying";
			definition = "Competent Authority for Direct Underlying.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "CADU";
		}
	};
	/**
	 * Competent Authority for Basket Constituent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CABC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForBasketConstituent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Basket Constituent."</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForBasketConstituent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForBasketConstituent";
			definition = "Competent Authority for Basket Constituent.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "CABC";
		}
	};
	/**
	 * Competent Authority for Buyer Branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CABB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForBuyerBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Buyer Branch."</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForBuyerBranch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForBuyerBranch";
			definition = "Competent Authority for Buyer Branch.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "CABB";
		}
	};
	/**
	 * Competent Authority for Seller Branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForSellerBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Seller Branch."</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForSellerBranch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForSellerBranch";
			definition = "Competent Authority for Seller Branch.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "CASB";
		}
	};
	/**
	 * Competent Authority for Membership Branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAMB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForMembershipBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Membership Branch."</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForMembershipBranch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForMembershipBranch";
			definition = "Competent Authority for Membership Branch.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "CAMB";
		}
	};
	/**
	 * Competent Authority for Decision Making Branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForDecisionMakingBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Decision Making Branch."</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForDecisionMakingBranch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForDecisionMakingBranch";
			definition = "Competent Authority for Decision Making Branch.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "CADB";
		}
	};
	/**
	 * Competent Authority for Executing Branch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAEB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForExecutingBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Executing Branch."</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForExecutingBranch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForExecutingBranch";
			definition = "Competent Authority for Executing Branch.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "CAEB";
		}
	};
	/**
	 * Competent Authority for Trading Venue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CATV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForTradingVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Trading Venue."</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForTradingVenue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForTradingVenue";
			definition = "Competent Authority for Trading Venue.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "CATV";
		}
	};
	/**
	 * Competent Authority for Index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AuthorityExchangeReasonCode
	 * AuthorityExchangeReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAIX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetentAuthorityForIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Competent Authority for Index."</li>
	 * </ul>
	 */
	public static final MMCode mmCompetentAuthorityForIndex = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetentAuthorityForIndex";
			definition = "Competent Authority for Index.";
			owner_lazy = () -> AuthorityExchangeReasonCode.mmObject();
			codeName = "CAIX";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AuthorityExchangeReasonCode";
				definition = "Specifies the reason for the exchange with the national competent authority.";
				code_lazy = () -> Arrays.asList(AuthorityExchangeReasonCode.mmCompetentAuthorityForInstrument, AuthorityExchangeReasonCode.mmCompetentAuthorityForHeadquarter, AuthorityExchangeReasonCode.mmAdHocRequest,
						AuthorityExchangeReasonCode.mmOther, AuthorityExchangeReasonCode.mmCompetentAuthorityForDirectUnderlying, AuthorityExchangeReasonCode.mmCompetentAuthorityForBasketConstituent,
						AuthorityExchangeReasonCode.mmCompetentAuthorityForBuyerBranch, AuthorityExchangeReasonCode.mmCompetentAuthorityForSellerBranch, AuthorityExchangeReasonCode.mmCompetentAuthorityForMembershipBranch,
						AuthorityExchangeReasonCode.mmCompetentAuthorityForDecisionMakingBranch, AuthorityExchangeReasonCode.mmCompetentAuthorityForExecutingBranch, AuthorityExchangeReasonCode.mmCompetentAuthorityForTradingVenue,
						AuthorityExchangeReasonCode.mmCompetentAuthorityForIndex);
				derivation_lazy = () -> Arrays.asList(AuthorityExchangeReason1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}