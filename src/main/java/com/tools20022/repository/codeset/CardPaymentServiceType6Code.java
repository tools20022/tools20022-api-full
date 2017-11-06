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
import com.tools20022.repository.codeset.CardPaymentServiceTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Service provided by the card payment transaction, in addition to the main
 * service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
 * CardPaymentServiceTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#mmAggregation
 * CardPaymentServiceType6Code.mmAggregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#mmDCC
 * CardPaymentServiceType6Code.mmDCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#mmGratuity
 * CardPaymentServiceType6Code.mmGratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#mmLoyalty
 * CardPaymentServiceType6Code.mmLoyalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#mmNoShow
 * CardPaymentServiceType6Code.mmNoShow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#mmPurchaseCorporate
 * CardPaymentServiceType6Code.mmPurchaseCorporate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#mmRecurringPayment
 * CardPaymentServiceType6Code.mmRecurringPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#mmSolicitedAvailableFunds
 * CardPaymentServiceType6Code.mmSolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#mmVoiceAuthorisation
 * CardPaymentServiceType6Code.mmVoiceAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#mmIssuerInstalment
 * CardPaymentServiceType6Code.mmIssuerInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#mmAcceptorInstalment
 * CardPaymentServiceType6Code.mmAcceptorInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#mmCashBack
 * CardPaymentServiceType6Code.mmCashBack}</li>
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
 * <li>"AGGR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentServiceType6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Service provided by the card payment transaction, in addition to the main service."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
 * CardPaymentServiceType9Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
 * CardPaymentServiceType2Code}</li>
 * </ul>
 */
public class CardPaymentServiceType6Code extends CardPaymentServiceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aggregation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#mmAggregation
	 * CardPaymentServiceType9Code.mmAggregation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#mmAggregation
	 * CardPaymentServiceType2Code.mmAggregation}</li>
	 * </ul>
	 */
	public static final MMCode mmAggregation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aggregation";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmAggregation);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmAggregation;
			owner_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DCC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#mmDCC
	 * CardPaymentServiceType9Code.mmDCC}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#mmDCC
	 * CardPaymentServiceType2Code.mmDCC}</li>
	 * </ul>
	 */
	public static final MMCode mmDCC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DCC";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmDCC);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmDCC;
			owner_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#mmGratuity
	 * CardPaymentServiceType9Code.mmGratuity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#mmGratuity
	 * CardPaymentServiceType2Code.mmGratuity}</li>
	 * </ul>
	 */
	public static final MMCode mmGratuity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gratuity";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmGratuity);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmGratuity;
			owner_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loyalty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#mmLoyalty
	 * CardPaymentServiceType9Code.mmLoyalty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#mmLoyalty
	 * CardPaymentServiceType2Code.mmLoyalty}</li>
	 * </ul>
	 */
	public static final MMCode mmLoyalty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loyalty";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmLoyalty);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmLoyalty;
			owner_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoShow"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#mmNoShow
	 * CardPaymentServiceType9Code.mmNoShow}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#mmNoShow
	 * CardPaymentServiceType2Code.mmNoShow}</li>
	 * </ul>
	 */
	public static final MMCode mmNoShow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoShow";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmNoShow);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmNoShow;
			owner_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseCorporate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#mmPurchaseCorporate
	 * CardPaymentServiceType9Code.mmPurchaseCorporate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#mmPurchaseCorporate
	 * CardPaymentServiceType2Code.mmPurchaseCorporate}</li>
	 * </ul>
	 */
	public static final MMCode mmPurchaseCorporate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseCorporate";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmPurchaseCorporate);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmPurchaseCorporate;
			owner_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringPayment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#mmRecurringPayment
	 * CardPaymentServiceType9Code.mmRecurringPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#mmRecurringPayment
	 * CardPaymentServiceType2Code.mmRecurringPayment}</li>
	 * </ul>
	 */
	public static final MMCode mmRecurringPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringPayment";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmRecurringPayment);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmRecurringPayment;
			owner_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedAvailableFunds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#mmSolicitedAvailableFunds
	 * CardPaymentServiceType9Code.mmSolicitedAvailableFunds}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#mmSolicitedAvailableFunds
	 * CardPaymentServiceType2Code.mmSolicitedAvailableFunds}</li>
	 * </ul>
	 */
	public static final MMCode mmSolicitedAvailableFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitedAvailableFunds";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmSolicitedAvailableFunds);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmSolicitedAvailableFunds;
			owner_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoiceAuthorisation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#mmVoiceAuthorisation
	 * CardPaymentServiceType9Code.mmVoiceAuthorisation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#mmVoiceAuthorisation
	 * CardPaymentServiceType2Code.mmVoiceAuthorisation}</li>
	 * </ul>
	 */
	public static final MMCode mmVoiceAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoiceAuthorisation";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmVoiceAuthorisation);
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType2Code.mmVoiceAuthorisation;
			owner_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInstalment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#mmIssuerInstalment
	 * CardPaymentServiceType9Code.mmIssuerInstalment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuerInstalment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInstalment";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmIssuerInstalment);
			owner_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorInstalment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#mmAcceptorInstalment
	 * CardPaymentServiceType9Code.mmAcceptorInstalment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcceptorInstalment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorInstalment";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmAcceptorInstalment);
			owner_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
	 * CardPaymentServiceType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBack"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#mmCashBack
	 * CardPaymentServiceType9Code.mmCashBack}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCashBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashBack";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmCashBack);
			owner_lazy = () -> CardPaymentServiceType6Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("AGGR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType6Code";
				definition = "Service provided by the card payment transaction, in addition to the main service.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentServiceType9Code.mmObject());
				previousVersion_lazy = () -> CardPaymentServiceType2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType6Code.mmAggregation, com.tools20022.repository.codeset.CardPaymentServiceType6Code.mmDCC,
						com.tools20022.repository.codeset.CardPaymentServiceType6Code.mmGratuity, com.tools20022.repository.codeset.CardPaymentServiceType6Code.mmLoyalty,
						com.tools20022.repository.codeset.CardPaymentServiceType6Code.mmNoShow, com.tools20022.repository.codeset.CardPaymentServiceType6Code.mmPurchaseCorporate,
						com.tools20022.repository.codeset.CardPaymentServiceType6Code.mmRecurringPayment, com.tools20022.repository.codeset.CardPaymentServiceType6Code.mmSolicitedAvailableFunds,
						com.tools20022.repository.codeset.CardPaymentServiceType6Code.mmVoiceAuthorisation, com.tools20022.repository.codeset.CardPaymentServiceType6Code.mmIssuerInstalment,
						com.tools20022.repository.codeset.CardPaymentServiceType6Code.mmAcceptorInstalment, com.tools20022.repository.codeset.CardPaymentServiceType6Code.mmCashBack);
				trace_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}