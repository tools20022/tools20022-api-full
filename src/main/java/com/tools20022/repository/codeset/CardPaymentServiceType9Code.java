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
import com.tools20022.repository.codeset.CardPaymentServiceType9Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Service provided by the card payment transaction, in addition to the main
 * service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#Aggregation
 * CardPaymentServiceType9Code.Aggregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#DCC
 * CardPaymentServiceType9Code.DCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#Gratuity
 * CardPaymentServiceType9Code.Gratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#Loyalty
 * CardPaymentServiceType9Code.Loyalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#NoShow
 * CardPaymentServiceType9Code.NoShow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#PurchaseCorporate
 * CardPaymentServiceType9Code.PurchaseCorporate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#RecurringPayment
 * CardPaymentServiceType9Code.RecurringPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#SolicitedAvailableFunds
 * CardPaymentServiceType9Code.SolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#VoiceAuthorisation
 * CardPaymentServiceType9Code.VoiceAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#IssuerInstalment
 * CardPaymentServiceType9Code.IssuerInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#AcceptorInstalment
 * CardPaymentServiceType9Code.AcceptorInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#CashBack
 * CardPaymentServiceType9Code.CashBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#Instant
 * CardPaymentServiceType9Code.Instant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code#NonRefundable
 * CardPaymentServiceType9Code.NonRefundable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
 * CardPaymentServiceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentServiceType9Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Service provided by the card payment transaction, in addition to the main service."
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code
 * CardPaymentServiceType6Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardPaymentServiceType9Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aggregation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#Aggregation
	 * CardPaymentServiceType6Code.Aggregation}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code Aggregation = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aggregation";
			previousVersion_lazy = () -> CardPaymentServiceType6Code.Aggregation;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Aggregation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#DCC
	 * CardPaymentServiceType6Code.DCC}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code DCC = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DCC";
			previousVersion_lazy = () -> CardPaymentServiceType6Code.DCC;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.DCC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#Gratuity
	 * CardPaymentServiceType6Code.Gratuity}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code Gratuity = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gratuity";
			previousVersion_lazy = () -> CardPaymentServiceType6Code.Gratuity;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Gratuity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loyalty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#Loyalty
	 * CardPaymentServiceType6Code.Loyalty}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code Loyalty = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loyalty";
			previousVersion_lazy = () -> CardPaymentServiceType6Code.Loyalty;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Loyalty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoShow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#NoShow
	 * CardPaymentServiceType6Code.NoShow}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code NoShow = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoShow";
			previousVersion_lazy = () -> CardPaymentServiceType6Code.NoShow;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.NoShow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseCorporate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#PurchaseCorporate
	 * CardPaymentServiceType6Code.PurchaseCorporate}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code PurchaseCorporate = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseCorporate";
			previousVersion_lazy = () -> CardPaymentServiceType6Code.PurchaseCorporate;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.PurchaseCorporate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#RecurringPayment
	 * CardPaymentServiceType6Code.RecurringPayment}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code RecurringPayment = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringPayment";
			previousVersion_lazy = () -> CardPaymentServiceType6Code.RecurringPayment;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.RecurringPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedAvailableFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#SolicitedAvailableFunds
	 * CardPaymentServiceType6Code.SolicitedAvailableFunds}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code SolicitedAvailableFunds = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitedAvailableFunds";
			previousVersion_lazy = () -> CardPaymentServiceType6Code.SolicitedAvailableFunds;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.SolicitedAvailableFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoiceAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#VoiceAuthorisation
	 * CardPaymentServiceType6Code.VoiceAuthorisation}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code VoiceAuthorisation = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoiceAuthorisation";
			previousVersion_lazy = () -> CardPaymentServiceType6Code.VoiceAuthorisation;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.VoiceAuthorisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#IssuerInstalment
	 * CardPaymentServiceType6Code.IssuerInstalment}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code IssuerInstalment = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInstalment";
			previousVersion_lazy = () -> CardPaymentServiceType6Code.IssuerInstalment;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.IssuerInstalment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#AcceptorInstalment
	 * CardPaymentServiceType6Code.AcceptorInstalment}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code AcceptorInstalment = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorInstalment";
			previousVersion_lazy = () -> CardPaymentServiceType6Code.AcceptorInstalment;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.AcceptorInstalment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType6Code#CashBack
	 * CardPaymentServiceType6Code.CashBack}</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code CashBack = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashBack";
			previousVersion_lazy = () -> CardPaymentServiceType6Code.CashBack;
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.CashBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code Instant = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instant";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.Instant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType9Code
	 * CardPaymentServiceType9Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonRefundable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CardPaymentServiceType9Code NonRefundable = new CardPaymentServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonRefundable";
			owner_lazy = () -> com.tools20022.repository.codeset.CardPaymentServiceType9Code.mmObject();
			codeName = CardPaymentServiceTypeCode.NonRefundable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardPaymentServiceType9Code> codesByName = new LinkedHashMap<>();

	protected CardPaymentServiceType9Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AGGR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType9Code";
				definition = "Service provided by the card payment transaction, in addition to the main service.";
				previousVersion_lazy = () -> CardPaymentServiceType6Code.mmObject();
				trace_lazy = () -> CardPaymentServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType9Code.Aggregation, com.tools20022.repository.codeset.CardPaymentServiceType9Code.DCC,
						com.tools20022.repository.codeset.CardPaymentServiceType9Code.Gratuity, com.tools20022.repository.codeset.CardPaymentServiceType9Code.Loyalty, com.tools20022.repository.codeset.CardPaymentServiceType9Code.NoShow,
						com.tools20022.repository.codeset.CardPaymentServiceType9Code.PurchaseCorporate, com.tools20022.repository.codeset.CardPaymentServiceType9Code.RecurringPayment,
						com.tools20022.repository.codeset.CardPaymentServiceType9Code.SolicitedAvailableFunds, com.tools20022.repository.codeset.CardPaymentServiceType9Code.VoiceAuthorisation,
						com.tools20022.repository.codeset.CardPaymentServiceType9Code.IssuerInstalment, com.tools20022.repository.codeset.CardPaymentServiceType9Code.AcceptorInstalment,
						com.tools20022.repository.codeset.CardPaymentServiceType9Code.CashBack, com.tools20022.repository.codeset.CardPaymentServiceType9Code.Instant,
						com.tools20022.repository.codeset.CardPaymentServiceType9Code.NonRefundable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Aggregation.getCodeName().get(), Aggregation);
		codesByName.put(DCC.getCodeName().get(), DCC);
		codesByName.put(Gratuity.getCodeName().get(), Gratuity);
		codesByName.put(Loyalty.getCodeName().get(), Loyalty);
		codesByName.put(NoShow.getCodeName().get(), NoShow);
		codesByName.put(PurchaseCorporate.getCodeName().get(), PurchaseCorporate);
		codesByName.put(RecurringPayment.getCodeName().get(), RecurringPayment);
		codesByName.put(SolicitedAvailableFunds.getCodeName().get(), SolicitedAvailableFunds);
		codesByName.put(VoiceAuthorisation.getCodeName().get(), VoiceAuthorisation);
		codesByName.put(IssuerInstalment.getCodeName().get(), IssuerInstalment);
		codesByName.put(AcceptorInstalment.getCodeName().get(), AcceptorInstalment);
		codesByName.put(CashBack.getCodeName().get(), CashBack);
		codesByName.put(Instant.getCodeName().get(), Instant);
		codesByName.put(NonRefundable.getCodeName().get(), NonRefundable);
	}

	public static CardPaymentServiceType9Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardPaymentServiceType9Code[] values() {
		CardPaymentServiceType9Code[] values = new CardPaymentServiceType9Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardPaymentServiceType9Code> {
		@Override
		public CardPaymentServiceType9Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardPaymentServiceType9Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}